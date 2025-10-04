echo "===== 1 ====="
mkdir lab0
cd lab0
mkdir -p gothitelle1/{shellos,feebas}
mkdir -p klang9/{azurill,lopunny}
mkdir -p tepig0/{charizard,butterfree,ekans}
touch accelgor5 drapion0 piloswine8
touch gothitelle1/totodile gothitelle1/dusknoir
touch klang9/bonsly klang9/beldum klang9/flaaffy
touch tepig0/sceptile
echo "weight=55.8 height=31.0 atk=7 def=4" > accelgor5
echo "Возможности" > drapion0
echo "Overland=8 Surface=4 Jump=2 Power=3 Intelligence=4" >> drapion0
echo "Тип" > gothitelle1/totodile
echo "покемона WATER NONE" >> gothitelle1/totodile
echo "Живет Cave Forest" > gothitelle1/dusknoir
echo "Mountain" >> gothitelle1/dusknoir
cat > klang9/bonsly <<'EOF'
Ходы After You Block Covet Earth Power Foul Play
Helping Hand Low Kick Magic Coat Role Play Rollout Sleep Talk Snore
Stealth Rock Sucker Punch Uproar
EOF
cat > klang9/beldum <<'EOF'
Способности  Unbreakable Mind
Mold Clear Body Lightningrod
EOF
cat > klang9/flaaffy <<'EOF'
Способности  Thunder Wave
Thundershock Cotton Spore Charge Take Down  Electro Ball Confuse Ray
Power Gem Discharge Cotton Guard Signal Beam Light Screen
Thunder
EOF
echo "Живет Cave Taiga Tundra" > piloswine8
cat > tepig0/sceptile <<'EOF'
Развитие
Способности  Marvel Scale
EOF
ls -R
cd ..

echo
echo "===== 2 ====="
cd lab0
chmod 404 accelgor5
chmod u=,g=rw,o= drapion0
chmod 066 piloswine8
chmod u=rx,g=wx,o=rwx gothitelle1
chmod 555 gothitelle1/shellos
chmod u=,g=,o=rw gothitelle1/totodile
chmod 644 gothitelle1/dusknoir
chmod u=rx,g=x,o=wx gothitelle1/feebas
chmod u=rx,g=rwx,o=rwx klang9
chmod 550 klang9/azurill
chmod 551 klang9/lopunny
chmod u=rw,g=,o=r klang9/bonsly
chmod 622 klang9/beldum
chmod 600 klang9/flaaffy
chmod 312 tepig0
chmod u+rwx,g+rx,o+w tepig0/charizard
chmod 373 tepig0/butterfree
chmod 777 tepig0/ekans
chmod u=rw,g=w,o=r tepig0/sceptile
ls -l
chmod u+r tepig0
ls -l gothitelle1 klang9 tepig0
chmod u-r tepig0
cd ..

echo
echo "===== 3 ====="
cd lab0
chmod u+r tepig0
cp accelgor5 tepig0/sceptileaccelgor
chmod u-r tepig0
cat klang9/flaaffy gothitelle1/dusknoir > drapion0_70
chmod u+w klang9
ln -s ../accelgor5 klang9/bonslyaccelgor
ln accelgor5 klang9/beldumaccelgor
chmod u-w klang9
ln -s klang9 Copy_16
chmod u+w gothitelle1/shellos
chmod u+r tepig0
chmod u+r tepig0/butterfree
cp -r tepig0 gothitelle1/shellos/
chmod u-r tepig0
chmod u-r tepig0/butterfree
chmod u-w gothitelle1/shellos
chmod u+w gothitelle1/shellos
cp accelgor5 gothitelle1/shellos/
chmod u-w gothitelle1/shellos
ls -l
chmod u+r tepig0
ls -l gothitelle1 klang9 tepig0
chmod u-r tepig0
cd ..

echo
echo "===== 4 ====="

echo "1)Подсчитать количество строк содержимого файлов: totodile, dusknoir, bonsly, beldum, flaaffy, отсортировать вывод по уменьшению количества, ошибки доступа перенаправить в файл в директории /tmp
"
wc -l lab0/gothitelle1/totodile lab0/gothitelle1/dusknoir lab0/klang9/bonsly lab0/klang9/beldum lab0/klang9/flaaffy 2>/tmp/lab0_errors | sort -nr

echo
echo "2)Вывести список имен файлов в директории klang9, список отсортировать по имени z->a, добавить вывод ошибок доступа в стандартный поток вывода"
ls lab0/klang9 2>&1 | sort -r

echo
echo "3) Вывести содержимое файлов с номерами строк в директории tepig0, строки отсортировать по имени z->a, подавить вывод ошибок доступа"
cat -n $(ls -1 lab0/tepig0/* 2>/dev/null | sort -r) 2>/dev/null

echo
echo "4) Вывести рекурсивно список имен файлов в директории klang9, список отсортировать по имени z->a, добавить вывод ошибок доступа в стандартный поток вывода"
ls -R lab0/klang9 2>&1 | grep -v ':$' | grep -v '^$' | sort -r

echo
echo "5) Вывести три последних элемента рекурсивного списка имен и атрибутов файлов в директории lab0, заканчивающихся на символ 'e', список отсортировать по убыванию размера, добавить вывод ошибок доступа в стандартный поток вывода"
ls -lR lab0 2>&1 | grep '^-.* e$' | sort -k5,5nr | tail -n 3

echo
echo "6) Вывести два последних элемента рекурсивного списка имен и атрибутов файлов в директории lab0, содержащих строку ""to"", список отсортировать по убыванию количества жестких ссылок, подавить вывод ошибок доступа"
ls -lR lab0 2>/dev/null | grep '^-.*to' | sort -k2,2nr | tail -n 2


echo
echo "===== 5 ====="
cd lab0

rm -f piloswine8

chmod u+w gothitelle1
rm -f gothitelle1/dusknoir

rm -f Copy_*
chmod u+w klang9
rm -f klang9/beldumaccelg*

chmod u+w gothitelle1/shellos
rm -rf gothitelle1/shellos/tepig0
rm -f gothitelle1/shellos/accelgor5
rm -f gothitelle1/totodile
rmdir gothitelle1/shellos
rmdir gothitelle1/feebas
rmdir gothitelle1

chmod u+w tepig0
rmdir tepig0/butterfree

chmod u+r tepig0
ls -R
chmod u-r tepig0
cd ..
