#!/bin/bash
# declare STRING variable
HOST="128.110.217.205"
PORT="32677"
PATH="api/v1/preserveotherservice/preserveOther"

WARMUP_THREAD=2
WARMUP_CONNECTION=2
WARMUP_DURATION=120
WARMUP_RPS=4

THREAD=2
CONNECTION=2
DURATION=60
RPS=4

BASE_PATH=train-ticket-test/req_analyzer_tool

# print variable on a screen
echo "Initialized system variables"

echo "STARTING WARMUP EXECUTION"
./${BASE_PATH}/wrk -D exp -t${WARMUP_THREAD} -c${WARMUP_CONNECTION} -d${WARMUP_DURATION}s --latency -L -s ./${BASE_PATH}/scripts/train-ticket/preserve_other_service.lua http://${HOST}:${PORT}/${PATH} -R ${WARMUP_RPS}

echo "STARTING FINAL ROUND OF EXECUTION"
for element in {1..10}
do
    echo "Starting Execution of phase - ${element} of 10 ..."
    ./${BASE_PATH}/wrk -D exp -t${THREAD} -c${CONNECTION} -d${DURATION}s --latency -L -s ./${BASE_PATH}/scripts/social-network/compose-post.lua http://${HOST}:${PORT}/${PATH} -R ${RPS}
    echo "End Execution of phase - ${element} of 10 ..."
    echo "Thread is taking nap for a minute"
    /bin/sleep 1m
done
