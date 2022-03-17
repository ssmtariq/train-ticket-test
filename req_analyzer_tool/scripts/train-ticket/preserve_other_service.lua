require "socket"
math.randomseed(socket.gettime()*1000)
math.random(); math.random(); math.random()

local charset = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's',
  'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Q',
  'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H',
  'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', '1', '2', '3', '4', '5',
  '6', '7', '8', '9', '0'}

local decset = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}

-- load env vars
local max_user_index = tonumber(os.getenv("max_user_index")) or 962

local function stringRandom(length)
  if length > 0 then
    return stringRandom(length - 1) .. charset[math.random(1, #charset)]
  else
    return ""
  end
end

local function decRandom(length)
  if length > 0 then
    return decRandom(length - 1) .. decset[math.random(1, #decset)]
  else
    return ""
  end
end

request = function()
  local user_index = math.random(1, max_user_index)
  local username = "username_" .. tostring(user_index)
  local user_id = tostring(user_index)
  local text = stringRandom(256)
  local num_user_mentions = math.random(0, 5)
  local num_urls = math.random(0, 5)
  local num_media = math.random(0, 4)
  local media_ids = '['
  local media_types = '['
  local server_ip_port = '#'

  for i = 0, num_user_mentions, 1 do
    local user_mention_id
    while (true) do
      user_mention_id = math.random(1, max_user_index)
      if user_index ~= user_mention_id then
        break
      end
    end
    text = text .. " @username_" .. tostring(user_mention_id)
  end

  for i = 0, num_urls, 1 do
    text = text .. " http://" .. stringRandom(64)
  end

  for i = 0, num_media, 1 do
    local media_id = decRandom(18)
    media_ids = media_ids .. "\"" .. media_id .. "\","
    media_types = media_types .. "\"png\","
  end

  media_ids = media_ids:sub(1, #media_ids - 1) .. "]"
  media_types = media_types:sub(1, #media_types - 1) .. "]"

local method = "POST"
  local path = server_ip_port .. "/api/v1/preserveservice/preserve"
  local headers = {}
  local body
  headers["Authorization"] = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZHNlX21pY3Jvc2VydmljZSIsInJvbGVzIjpbIlJPTEVfVVNFUiJdLCJpZCI6IjRkMmE0NmM3LTcxY2ItNGNmMS1iNWJiLWI2ODQwNmQ5ZGE2ZiIsImlhdCI6MTY0Njk0ODI3NywiZXhwIjoxNjQ2OTUxODc3fQ.5I3G49nESyBdbcjmusGqXDwX0UawpvvmctBLeV2Mu94"
  headers["Content-Type"] = "application/json"
  headers["Cookie"] = "JSESSIONID=21A0370861087E0831E5D25D56BC9ABB; YsbCaptcha=BE12EE0295F548569DCC1D5B07FDBA55"
  if num_media then
    body   = "{\"accountId\":\"4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f\",\"contactsId\":\"00d2dce3-2fa8-4eec-9f04-e71a17621b1b\",\"tripId\":\"D1345\",\"seatType\":\"2\",\"date\":\"2022-03-15\",\"from\":\"Shang Hai\",\"to\":\"Su Zhou\",\"assurance\":\"0\",\"foodType\":1,\"foodName\":\"\",\"foodPrice\":2.5,\"stationName\":\"\",\"storeName\":\"\"}"
  else
    body   = "{\"accountId\":\"4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f\",\"contactsId\":\"00d2dce3-2fa8-4eec-9f04-e71a17621b1b\",\"tripId\":\"D1345\",\"seatType\":\"2\",\"date\":\"2022-03-15\",\"from\":\"Shang Hai\",\"to\":\"Su Zhou\",\"assurance\":\"0\",\"foodType\":1,\"foodName\":\"\",\"foodPrice\":2.5,\"stationName\":\"\",\"storeName\":\"\"}"
  end

  return wrk.format(method, path, headers, body)
end
