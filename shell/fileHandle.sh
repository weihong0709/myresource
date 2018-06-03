#!/bin/bash
#文件比较
#-d file 检查file是否存在并是一个目录
#-e file 检查file是否存在
#-f file 检查file是否存在并是一个文件
#-r file 检查file是否存在并可读
#-s file 检查file是否存在并非空
#-w file 检查file是否存在并可写
#-x file 检查file是否存在并可执行
#-O file 检查file是否存在并属当前用户所有
#-G file 检查file是否存在并且默认组与当前用户相同
#file1 -nt file2 检查file1是否比file2新
#file1 -ot file2 检查file1是否比file2旧

#检查目录
jump_directory=/home/arthur #
if [ -d $jump_directory ] ;then
       echo "The $jump_directory directory exists"
       cd $jump_directory
       ls
    else
       echo "The $jump_directory directory does not exist"
fi 
#检查对象是否存在，对象可以是文件，或者目录
# Check if either a directory or file exists #
location=$HOME
file_name="sentinel"
#
if [ -e $location ]
then #Directory does exist
   echo "OK on the $location directory."
   echo "Now checking on the file, $file_name."
   
   if [ -e $location/$file_name ]
   then #File does exist
       echo "OK on the filename"
       echo "Updating Current Date..."
       date >> $location/$file_name
   
   else #File does not exist
       echo "File does not exist"
       echo "Nothing to update"
   fi
else   #Directory does not exist
   echo "The $location directory does not exist."
   echo "Nothing to update"         
fi
#检查文件是否存在
#-e比较可用于文件和目录。要确定指定对象为文件，必须用-f比较
item_name=$HOME
echo
echo "The item being checked: $item_name" echo
#
if [ -e $item_name ]
then #Item does exist
       echo "The item, $item_name, does exist."
       echo "But is it a file?"
       echo
       #
       if [ -f $item_name ]
       then #Item is a file
           echo "Yes, $item_name is a file."
       #
       else #Item is not a file
           echo "No, $item_name is not a file."
fi #
    else   #Item does not exist
       echo "The item, $item_name, does not exist."
       echo "Nothing to update"
fi
#检查文件是否可读 -r
# testing if you can read a file pwfile=/etc/shadow
# first, test if the file exists, and is a file 
pwfile=/etc/shadow
if [ -f $pwfile ]
then
       # now test if you can read it
       if [ -r $pwfile ]
       then
          tail $pwfile
       else
          echo "Sorry, I am unable to read the $pwfile file"
       fi
    else
       echo "Sorry, the file $file does not exist"
fi


