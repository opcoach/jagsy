Contributing to Jagsy
===================

Contributions to the Jagsy projects are most welcome. There are many ways to contribute, 
from entering high quality issues on github, to contributing code or documentation changes. 


Testing the Bugsy project
=========================
To test the bugsy project, clone the repository and launch the maven command in the bugsy directory : 

cd bugsy
mvn clean install

Then use the executable generated in  : com.opcoach.bugsy.xtext.repository/target/products


Entering issues
===============

You can enter as many issues as you want. 

Please follow this naming convention to enter issues. In the title prefix with : 

* [SYNTAX] for grammar issues.        
       Example :  [SYNTAX] Must manage the data bloc
       
* [CHECK]  for validation issues.     
       Example : [CHECK] An index used in a loop must be defined in the scope
       
* [ASSIST] for content assist issues. 
       Example : [ASSIST] The content assist for an index must be found in the 'for' scope
       
* [FIX]    for quick fixes issues.    
       Example : [FIX] When an index is not in the scope, propose to select one of the scope in the quick fix.



