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
testuser='liuweihong'
if grep $testuser /etc/passwd then
   echo "The bash files for user $testuser are:"
   ls -a /home/$testuser/.b*  
else
   echo "The user $testuser does not exist on this system."
fi