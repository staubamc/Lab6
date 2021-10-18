class Main {
  public static void main(String[] args) {

    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", "broadleaf", true, "red"); 

    tree1.print();
    tree2.print();

    //changing tree1 parameters 
    tree1.setTreeName("spruce");
    tree1.setTreeType("conifer");

    tree1.print();
  }
}