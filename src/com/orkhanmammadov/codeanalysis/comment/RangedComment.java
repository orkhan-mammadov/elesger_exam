package com.orkhanmammadov.codeanalysis.comment;

import com.orkhanmammadov.codeanalysis.SourceCodeElement;

import java.util.ArrayList;

public class RangedComment extends SourceCodeElement implements SuspiciousCommentDetector {

    private ArrayList<String> comments;

    public RangedComment(String[] comments, int startingLine, int columnIndexes) {

        this.startLine = startingLine;
        this.startColumn = columnIndexes;

        for( int i = startLine; i<comments.length; i ++) {
            if(!comments[i].contains("*//")){
                throw new IllegalArgumentException("Unclosed comment");
            }
        }
    }


}
