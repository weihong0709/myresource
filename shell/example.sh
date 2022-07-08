#!/bin/bash
#命令可以在一行 分号分隔，也可以多行
date;who
date
who
#文本中有引号时，echo需要使用另外一种引号，否则不需要引号
echo "echo a'test"
echo 'echo "test"dd'
echo a b c
#-n不输出换行符
echo -n now date:
date
#引用环境变量
echo $HOME
echo $USER
echo "this is \$15"
echo current user is ${USER}
#单引号里面的环境变量引用不会进行替换，例如如下,会直接输出"this is $15"
echo 'this is $15'
#用户变量，用等号进行赋值，等号后面不能有空格 shell脚本会自动决定变量值的数据类型。在脚本的整个生命周期里，shell脚本中定义的变量 会一直#保持着它们的值，但在shell脚本结束时会被删除掉
test=123;
echo $test;

value1=10
value2=$value1
echo The resulting value is $value2
#命令替换,两种写法
dir=`pwd`
echo $dir
dir=$(pwd);
echo $dir;
#命令替换，日期可以指定格式
today=$(date +%y%m%d)
echo $today;
#命令替换会创建一个子shell来运行对应的命令。子shell(subshell)是由运行该脚本的shell 所创建出来的一个独立的子shell(child shell)。#正因如此，由该子shell所执行命令是无法 使用脚本中所创建的变量的。 在命令行提示符下使用路径./运行命令的话，也会创建出子shell;要是##运行命令的时候 不加入路径，就不会创建子shell。如果你使用的是内建的shell命令，并不会涉及子shell。 在命令行提示符下运行脚本时一定#要留心!
#重定向输入和输出
#重定向输出
date>1.txt;
#双大于号追加数据,单大于号会覆盖文件
date>>1.txt
#重定向输入
grep 28 < 1.txt
#内联输入重定向
: 'command << marker
data
marker'
#wc 输出 文本的行数 文本的词数 文本的字节数
wc << EOF
addds dsdsd
sdsdsd
dssd
EOF
#管道连接符 |
ls | sort

#执行数学运算，有两种方式，方式二具有优势 bash shell数学运算符只支持整数运算。若要进行任何实际的数学计算，这是一个巨大的限制
#方式一，使用expr命令,符号前后需要空格
expr 2 + 3
#要将一个数学算式的结果赋给一个变量，需要使用命令替换来获取expr命令的输出
var1=10
var2=20
var3=$(expr $var2 / $var1)
echo The result is $var3
#方式二 使用方括号
count=$[2 + 3];
echo $count
countTwo=$[$count + 3]
echo $countTwo
#使用BC命令进行浮点数计算
var1=$(echo "scale=4; 3.44 / 5" | bc)
echo The answer is $var1
#使用内联输入重定向进行计算
var1=10.46
var2=43.67
var3=33.2
var4=71
var5=$(bc << EOF
scale = 4
a1 = ( $var1 * $var2)
b1 = ($var3 * $var4)
a1 + b1
EOF
)
#退出脚本
#shell中运行的每个命令都使用退出状态码(exit status)告诉shell它已经运行完毕。退出状态 码是一个0~255的整数值，在命令结束运行时由命令传给shell。可以捕获这个值并在脚本中使用。
#查看退出状态
date
echo $?
#exit命令，允许你在退出是指定一个退出状态码
exit 5




