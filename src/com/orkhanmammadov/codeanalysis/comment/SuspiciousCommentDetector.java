package com.orkhanmammadov.codeanalysis.comment;

import java.util.Locale;

public interface SuspiciousCommentDetector {
    public static boolean isSuspicious(String comment){
        comment = comment.toUpperCase(Locale.ROOT);
        if(comment.contains("BUG") || comment.contains("HACK") || comment.contains("FIXME") || comment.contains("LATER") || comment.contains("LATER2") || comment.contains("TODO"))
            return true;
        return false;
    };
}
