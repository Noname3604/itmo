import re
import locale
locale.setlocale(locale.LC_ALL, 'ru_RU.UTF-8')

initials = r"(?:[А-ЯЁ]\.\s?){2}"
surname1 = r"[А-ЯЁ][а-яё]*"
surname2 = r"(?:[\'-][А-ЯЁ][а-яё]*)"
pattern = rf"({surname1}{surname2}?)\s*{initials}"

def func(text):
    surnames = sorted(set(re.findall(pattern, text)), key=locale.strxfrm)
    return surnames

tests = [
    {
        "text": """Студент Вася вспомнил, что на своей
лекции Балакшин П.В. упоминал про
старшекурсников, которые будут ему
помогать: Анищенко А.А., Машина Е.А.
и Голованова-Иванова Д.В.""",
        "expected": ["Анищенко", "Балакшин", "Голованова-Иванова", "Машина"],
    },
    {
        "text": "Иванов И.И. и Петров П.П. пришли. Иванов И.И. ушел. Вася не Петя.",
        "expected": ["Иванов", "Петров"],
    },
    {
        "text": "Сидоров-Ильин А.Б. и Петров не сделали аннотацию.",
        "expected": ["Сидоров-Ильин"],
    },
    {
        "text": "Кузнецова К. С. решила поставить пробел между инициалами, а ЁльцинаБ.Н. нет, АраповаА.П.",
        "expected": ["Арапова", "Ёльцина", "Кузнецова"],
    },
    {
        "text": "Павлов П.\nА.",
        "expected": ["Павлов"],
    },
    {
        "text": "О'Коннор А.А. приехал, но Да-Да П.П. отсутствовал.",
        "expected": ["Да-Да", "О'Коннор"],
    },
]

for i in range (len(tests)):
    print(f"======ТЕСТ {i}======")
    result = func(tests[i]["text"])
    print("Ожидается: ")
    print(tests[i]["expected"])
    print("Результат: ")
    print(result)
    if result == tests[i]["expected"]:
        print("Верно")
    else:
        print("ПСЖ")
