package AST;

public class Parse extends Node {

 Block block = null;


 public Block getBlock() {
  return block;
 }

 public void setBlock(Block block) {
  this.block = block;
 }

 @Override
 public String toString() {
  //return "\nParse{" + block.toString() + "\n}";

  return "\n\n\t" +
          "Run..";
 }
}
