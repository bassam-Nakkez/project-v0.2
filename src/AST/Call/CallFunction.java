package AST.Call;

import AST.Statements.Call;
import AST.Parameter;

import java.util.ArrayList;
import java.util.List;

public class CallFunction extends Call{

    String Id ;
    List<Parameter> parameters =new ArrayList<>();
    List<Call> call  = new ArrayList<>();


    public List<Parameter> getParameters() {
        return parameters;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public List<Call> getCall() {
        return call;
    }

    public  void  addCall(Call call)
    {
        this.call.add(call);
    }

    public void setCall(List<Call> call) {
        this.call = call;
    }

    @Override
    public String toString() {
        String str =  "CallFunction{";
        for(Parameter e : this.parameters )
        {

            if (e != null){
                str = str + "\n" + e.toString() ;

            }
        }

        for(Call e : this.call )
        {
if (e != null)
{
    str = str + "\n" + e.toString() ;

}
        }
        return  str + "\n" + Id + '}';
    }
}
