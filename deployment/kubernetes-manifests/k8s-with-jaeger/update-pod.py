#!/usr/bin/env python

import os
import time

print("Updating pod ts-train-service")
os.system("kubectl set image deployment/ts-train-service -n=default ts-train-service=ssmtariq/ts-train-service")
time.sleep(60)
print("Updating pod ts-travel2-service")
os.system("kubectl set image deployment/ts-travel2-service -n=default ts-travel2-service=ssmtariq/ts-travel2-service")
time.sleep(5)
print("Updating finished!")
