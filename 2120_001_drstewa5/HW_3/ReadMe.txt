To run-

1st: Create random student data. To produce random Student data, run the following from 
the command line:

java MakeRandomStudents 100 > students.txt

this will cause the program to generate 100

2nd: You'll need to create a CSV file to organize the new txt file you've just created. BuildAndSortStudentDataFromCSVFile takes two arguments: the formatted text file
to read in (students.txt), and the formatted text file to write out (sortedStudents.txt). After reading, the Student objects in the StudentDatabase are sorted based on their GPA, 
and the data is written out to the file listed as the second argument.
Every command in this package has two arguments, an input followed by an output.
 
Type this command in bash:

java BuildAndSortStudentDataFromCSVFile students.txt sortedStudents.txt

this will read in the formatted text file above, and write out the data to a file called
sortedStudents.txt.

3rd:We need to beef up our simple and unfulfilling CSV file. Lets run BuildAndSortStudentDataFromCSVFile. The purpose of this class is to take a 
csv file and write a file in the form a an organized and formatted database.

heres what to type into bash:

java BuildAndSortStudentDataFromCSVFile sortedStudents.txt yourDatabase.txt 

4th: At this point, your formerly jenky CSV file is in the form of a graduated StudentDatabase. It's hella organized, so lets **** that up and serialize it into a binary array of digits called a .ser file. You wont be able to read it with your eyeballs, but your computer will appreciate it. Apparently, serialized files are very portable and you can think of it as <metaphor>taking a package that youd normally need fedex to transport and smashing it into a letter that you can send in an envelope to your friend, and somehow your friend will be able to transform it back into a whole package.</metaphor>

Serializing files saves the state of objects whose classes implement serializable, so in this case both student objects and student databases will be able to be reduced into serialized files then reproduced later as databases or even back into serialized files.

Type this command in bash to smash your database into a 2D smattering of bits:

java BuildSortAndSerializeStudentDatabase yourDatabase.txt yourDatabase.ser

So just a reminder, you cant read this new file you just made without a compiler...uuuunless you converted it back to a CSV file. So i guess, lets do that.

run this in bash:

java ReadSortAndSerializeStudentDatabase yourDatabase.ser yourDatabase.txt

bam, it's back in the king's english again. but lets say you didn't run that last command because for some indiscernable reason you wanted to write a serialized file as another serialized file. Maybe you changed your "sortByGPA()" method and you need to re-sort your serializable file. This last command reads a serializable file back into a database. this is sort of an intermediate step that allows us to employ database methods to our file. After it sorts, it writes the file  back to the output stream.

use your fingers to type this on your machine:

java SerializeToSerialize yourDatabase.ser yourDatabase.ser 

thanks for this excercise, i feel like i learned a lot.
thats all!





 