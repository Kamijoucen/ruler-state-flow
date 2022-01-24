package com.kamijoucen.stateflow.node;

import com.kamijoucen.ruler.util.IOUtil;

public class RulerCondition {

    private String script;
    private String expression;

    public RulerCondition(String script, String expression) {
        this.script = script;
        this.expression = expression;
    }

    public boolean isExpression() {
        return IOUtil.isNotBlank(expression);
    }

    public String getScript() {
        return script;
    }
    public void setScript(String script) {
        this.script = script;
    }
    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }

}
