package calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Eval {
	public String jsEval(String s) {
		ScriptEngineManager sm = new ScriptEngineManager();
		ScriptEngine e = sm.getEngineByName("JavaScript");
		try {
			return "" + e.eval(s);
		} catch(Exception ex) {
			return "Unexpected error";
		}
	}
}
