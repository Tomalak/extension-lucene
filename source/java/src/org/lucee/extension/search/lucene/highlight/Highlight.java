package org.lucee.extension.search.lucene.highlight;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.search.Query;


public class Highlight {

	public static String createContextSummary(Object highlighter, Analyzer analyzer, String text,int maxNumFragments, int maxLength,String defaultValue) {
		if(maxNumFragments==0) return "";
		try {
			return _Highlight.createContextSummary(highlighter, analyzer, text,maxNumFragments, defaultValue);
		}
		catch(Throwable t) {if(t instanceof ThreadDeath) throw (ThreadDeath)t;}	
		return defaultValue;
	}

	public static Object createHighlighter(Query query,String highlightBegin,String highlightEnd) {
		try {
			return _Highlight.createHighlighter(query,highlightBegin,highlightEnd);
		}
		catch(Throwable t) {if(t instanceof ThreadDeath) throw (ThreadDeath)t;}
		return null;
	}

}
