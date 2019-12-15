#!/bin/bash
#for循环
#for var in list do
#commands
#done
for test in Alabama Alaska Arizona Arkansas California Colorado
do
        echo The next state is $test
done
#在最后一次迭代后，$test变量的值会在shell脚本的剩余 部分一直保持有效。它会一直保持最后一次迭代的值(除非你修改了它)
for test in Alabama Alaska Arizona Arkansas California Colorado 10 
do
    echo "The next state is $test"
done
echo "The last state we visited was $test" 
test=Connecticut
echo "Wait, now we're visiting $test"
#
for filename in `ls *.sh`
do
  mv $filename  ${filename}_old.txt
done


