#!/usr/bin/env python

import os
import time

print("Reverting pod update ts-train-service")
os.system("kubectl set image deployment/ts-train-service -n=default ts-train-service=codewisdom/ts-train-service-with-jaeger:v1")
time.sleep(30)
print("Reverting pod update ts-travel2-service")
os.system("kubectl set image deployment/ts-travel2-service -n=default codewisdom/ts-travel2-service-with-jaeger:v1")
time.sleep(5)
print("Updating finished!")
