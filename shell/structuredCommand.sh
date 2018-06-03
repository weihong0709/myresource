#if-then 语句 命令的退出状态码为0 then后的就会被执行
#if command then
#commands
#fi
if pwd
then
        echo "It worked"
fi
#另一种形式
if pwd; then
        echo "It worked"
fi
#带else分支的if语句
testuser='liuweihong'
if grep $testuser /etc/passwd 
then
   echo "The bash files for user $testuser are:"
   ls -a /home/$testuser/.b*  
else
   echo "The user $testuser does not exist on this system."
fi
#嵌套if
testuser=NoSuchUser
if grep $testuser /etc/passwd
    then
       echo "The user $testuser exists on this system."
    else
       echo "The user $testuser does not exist on this system."
       if ls -d /home/$testuser/
       then
          echo "However, $testuser has a directory."
       fi
fi
#使用else if语法 elif
if grep $testuser /etc/passwd
then
   echo "The user $testuser exists on this system."
elif ls -d /home/$testuser
then
   echo "The user $testuser does not exist on this system."
   echo "However, $testuser has a directory."
fi
#使用 elif else
if grep $testuser /etc/passwd
then
   echo "The user $testuser exists on this system."
elif ls -d /home/$testuser
then
   echo "The user $testuser does not exist on this system."
   echo "However, $testuser has a directory."
else
   echo "The user $testuser does not exist on this system."
   echo "And, $testuser does not have a directory."
fi

#test命令 测试变量是否有内容 test后带表达式
my_variable="full"
if test $my_variable
then
   echo "The $my_variable expression returns a True"
#
else
   echo "The $my_variable expression returns a False"
fi


#bash shell提供了另一种条件测试方法，无需在if-then语句中声明test命令。
#if [ condition ] then
#commands
#fi
#test可以判断三类条件 （1）数值比较 只能处理整数（2）字符串比较 （3）文件比较
#n1 -eq n2 检查n1是否与n2相等
#n1 -ge n2 检查n1是否大于或等于n2
#n1 -gt n2 检查n1是否大于n2
#n1 -le n2 检查n1是否小于或等于n2
#n1 -lt n2 检查n1是否小于n2
#n1 -ne n2 检查n1是否不等于n2

value1=10
value2=11
#
if [ $value1 -gt 5 ]
then
    echo "The test value $value1 is greater than 5"
fi
#
if [ $value1 -eq $value2 ]
then
    echo "The values are equal"
else
    echo "The values are different"
fi
#字符串比较
#str1 = str2 检查str1是否和str2相同
#str1 != str2 检查str1是否和str2不同
#str1 < str2 检查str1是否比str2小
#str1 > str2 检查str1是否比str2大
#-n str1 检查str1的长度是否非0
#-z str1 检查str1的长度是否为0
#字符串相等性
testuser=baduser
if [ $USER != $testuser ] 
	then
   echo "This is not $testuser"
   else
   echo "Welcome $testuser"
fi 
#字符串大小比较
#大于小于号必须转义，否则就变成重定向了
#在比较测试中，大写字母被认为是小于小写字母的。但sort命令恰好相反。当你将同样的 字符串放进文件中并用sort命令排序时，小写字母会先出现。这是由各个命令使用的排序技术 不同造成的。
#比较测试中使用的是标准的ASCII顺序，根据每个字符的ASCII数值来决定排序结果。sort 命令使用的是系统的本地化语言设置中定义的排序顺序。对于英语，本地化设置指定了在排序顺 序中小写字母出现在大写字母前
val1=baseball
val2=hockey
#
if [ $val1 \> $val2 ] 
     then
      echo "$val1 is greater than $val2"
    else
       echo "$val1 is less than $val2"
fi   
#字符串大小 -n和-z可以检查一个变量是否含有数据
val1=testing
val2=''
#
if [ -n $val1 ]
  then
       echo "The string '$val1' is not empty"
else
       echo "The string '$val1' is empty"
fi
    
if [ -z $val2 ]
   then
       echo "The string '$val2' is empty"
else
       echo "The string '$val2' is not empty"
fi
#判断val3变量是否长度为0。这个变量并未在shell脚本中定义过，所以它的字符串长度仍然 为0，尽管它未被定义过
if [ -z $val3 ]
    then
       echo "The string '$val3' is empty"
else
       echo "The string '$val3' is not empty"
fi





