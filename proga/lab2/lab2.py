s = input("Введите cообщение: ")
b = [int(ch) for ch in s]
r1, r2, i1, r3, i2, i3, i4 = b
s1 = r1 ^ i1 ^ i2 ^ i4
s2 = r2 ^ i1 ^ i3 ^ i4
s3 = r3 ^ i2 ^ i3 ^ i4
S = s1 + 2*s2 + 2**2*s3
if S != 0:
    b[S-1] ^= 1
    print(f"Обнаружена и исправлена ошибка в бите №{S}.")
res = "".join(str(b[i]) for i in [2,4,5,6])
print("Правильное сообщение", res)
