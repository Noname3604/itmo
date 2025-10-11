import re

HAS_LEN_5 = re.compile(r'^.{5,}$')
HAS_DIGIT = re.compile(r'\d')
HAS_UPPER = re.compile(r'[A-Z]')
HAS_SPECIAL = re.compile(r'[^A-Za-z0-9]')
HAS_MONTH =re.compile(r'january?|february?|march?|april?|may?|june?|july?|august?|september?|october?|november?'
                      r'|december?', re.IGNORECASE)
def check_password(password):
    errors = []
    if not HAS_LEN_5.search(password):
        errors.append("Your password must be at least 5 characters")
    if not HAS_DIGIT.search(password):
        errors.append("Your password must include a number")
    if not HAS_UPPER.search(password):
        errors.append("Your password must include an uppercase letter")
    if not HAS_SPECIAL.search(password):
        errors.append("Your password must include a special character")
    if not HAS_MONTH.search(password):
        errors.append("Your password must include a month of the year")
    sum_of_digits = sum(int(d) for d in re.findall(r'\d', password))
    if sum_of_digits != 25:
        errors.append("The digits in your password must add up to 25")

    return errors

passwords = [
    "A&March799",
    "799A",
    "!799july",
    "A&799",
    "July799",
]

for password in passwords:
    errors = check_password(password)
    print(f"{password} => ", "OK" if not errors else "FAIL \n - " + "\n - ".join(errors))