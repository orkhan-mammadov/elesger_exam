package com.orkhanmammadov.codeanalysis.comment;

import com.orkhanmammadov.codeanalysis.SourceCodeElement;

public class SingleLineComment extends SourceCodeElement implements SuspiciousCommentDetector {

    private String comment;

    public SingleLineComment(String comment, int lineIndex, int columnIndex) {
        this.comment = comment;
        this.startLine = lineIndex;
        this.startColumn = columnIndex;
    }

    @Override
    public boolean isSuspicious() {
        return false;
    }
}
