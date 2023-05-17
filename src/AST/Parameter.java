package AST;

import AST.Statements.Call;
import AST.Statements.Declaration;
import AST.Expression.Expression;

public class Parameter {


   public VariableDeclaration variableDeclaration = null;
   public Expression expression = null;
   public Declaration declaration = null;
   public Call call = null ;


   public VariableDeclaration getVariableDeclaration() {
      return variableDeclaration;
   }

   public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
      this.variableDeclaration = variableDeclaration;
   }

   public Expression getExpression() {
      return expression;
   }

   public void setExpression(Expression expression) {
      this.expression = expression;
   }

   public Declaration getDeclaration() {
      return declaration;
   }

   public void setDeclaration(Declaration declaration) {
      this.declaration = declaration;
   }

   public Call getCall() {
      return call;
   }

   public void setCall(Call call) {
      this.call = call;
   }
}
