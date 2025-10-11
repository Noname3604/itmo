import re

username = r"[A-Za-z0-9._]+"
domain_name = r"[A-Za-z]+"
tld = r"[A-Za-z]{2,}"
pattern = rf'{username}@({domain_name}\.{tld})'

def func(email):
    match = re.match(pattern, email)
    if match:
        return match.group(1)
    else:
        return "Fail!"

tests = [
    "email@email",
    "pavelbalakshin@PSZHonline.com",
    "test..@..ru",
    "test2@.a",
    "simple@email.vzhux"
]
for test in tests:
    print(f'{test} => {func(test)}')