class Tree { 
  private String treeName; 
  private String treeType; 
  private boolean leavesFall;
  private String leafColor;

//default constructor method w/ no parameters
  Tree(){ 
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }
 
//constructor method w/ all four instance variables are set on parameters 
  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor){
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;

  }

//treeName mutator method 
String getTreeName(){
  return treeName;
}

//treeType mutator method
String getTreeType(){
  return treeType;
}

//leavesFall mutator method
boolean getLeavesFall(){
  return leavesFall;
}

//leafColor mutator method
String getLeafColor(){
  return leafColor;
}


//treeName accessor method 
void setTreeName(String theTreeName) {
  treeName = theTreeName;
}

//treeType accessor method
void setTreeType(String theTreeType) {
  treeType = theTreeType;
}

//leavesFall accessor method
void setLeavesFall(boolean theLeavesFall){
  leavesFall = theLeavesFall;
}

//leafColor accessor method
void setLeafColor (String theLeafColor){
leafColor = theLeafColor;
}


void print(){ 
  
  //turning true/false to does/does not
  //true = does false = does not 
  String doLeavesFall = "does not";
  if(leavesFall ==true) {
    doLeavesFall = "does"; 
  }
  else {
    doLeavesFall = "does not";
  }
  
  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + doLeavesFall + " lose its leaves for the winter.");


}

}