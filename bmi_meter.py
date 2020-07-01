import numpy as np
height = [1.8, 1.6, 1.7, 1.7, 1.5] #meter
weight = [60, 65, 70, 100, 40] #kilogram

np_height = np.array(height)
np_weight = np.array(weight)

bmi = np_weight/ (np_height ** 2)

print(bmi)

count = 0
while count < bmi.size:
    # BMI source: cdc
    if bmi[count] > 30:
        print("Obese")

    elif bmi[count] < 18.5:
        print("underweight")

    elif 25 < bmi[count] < 30:
        print("overweight")

    else:
        print("Good")

    count +=1

    if count == bmi.size:
        break
