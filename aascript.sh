##!/bin/bash




function show_usage {
    echo "Usage: scriptA.sh name"
exit 1
}
if [ 1 -eq $# ]; then
say_hello

else

for script in $*; do
echo "hello " $script
done
fi
