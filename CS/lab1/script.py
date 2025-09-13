n = int(input("Число в десятичной СС: "))
if n == 0:
    print("Число в Фибоначчиевой СС: " + "0")
    exit(0)
fib = [1,2]
while fib[-1] + fib[-2] <= n:
    fib.append(fib[-1] + fib[-2])
res = ""
i = len(fib)-1
while i >= 0:
    if fib[i] <= n:
        res += "1"
        n -= fib[i]
        i -= 1
        if i >= 0:
            res += "0"
    else:
        res += "0"
    i-=1
res = res.lstrip("0")
print("Число в Фибоначчиевой СС: " + res)