require "socket"
math.randomseed(socket.gettime()*1000)
math.random(); math.random(); math.random()

request = function()
  local server_ip_port = '#'

local method = "POST"
  local path = server_ip_port .. "/api/v1/preserveservice/preserve"
  local headers = {}
  local body
  headers["Authorization"] = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZHNlX21pY3Jvc2VydmljZSIsInJvbGVzIjpbIlJPTEVfVVNFUiJdLCJpZCI6IjRkMmE0NmM3LTcxY2ItNGNmMS1iNWJiLWI2ODQwNmQ5ZGE2ZiIsImlhdCI6MTY0Njk0ODI3NywiZXhwIjoxNjQ2OTUxODc3fQ.5I3G49nESyBdbcjmusGqXDwX0UawpvvmctBLeV2Mu94"
  headers["Content-Type"] = "application/json"
  headers["Cookie"] = "JSESSIONID=21A0370861087E0831E5D25D56BC9ABB; YsbCaptcha=BE12EE0295F548569DCC1D5B07FDBA55"
  body   = "{\"accountId\":\"4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f\",\"contactsId\":\"00d2dce3-2fa8-4eec-9f04-e71a17621b1b\",\"tripId\":\"D1345\",\"seatType\":\"2\",\"date\":\"2022-03-15\",\"from\":\"Shang Hai\",\"to\":\"Su Zhou\",\"assurance\":\"0\",\"foodType\":1,\"foodName\":\"\",\"foodPrice\":2.5,\"stationName\":\"\",\"storeName\":\"\"}"
  return wrk.format(method, path, headers, body)
end
