package com.orkhanmammadov.codeanalysis;

import com.orkhanmammadov.codeanalysis.comment.SingleLineComment;

public abstract class SourceCodeElement {
    public int startLine;
    public int endLine;
    public int startColumn;
    public int endColumn;

    public int getStartLine() {
        return startLine;
    }

    public int getEndLine() {
        return endLine;
    }

    public int getStartColumn() {
        return startColumn;
    }

    public int getEndColumn() {
        return endColumn;
    }

    private static SourceCodeElement[] getElements(String[] elements){
        for(int i = 0; i < elements.length; i++){

        }
    }
}
