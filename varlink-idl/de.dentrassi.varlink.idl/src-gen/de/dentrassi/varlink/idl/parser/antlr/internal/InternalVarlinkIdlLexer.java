package de.dentrassi.varlink.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVarlinkIdlLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalVarlinkIdlLexer() {;} 
    public InternalVarlinkIdlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVarlinkIdlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVarlinkIdl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:11:7: ( 'interface' )
            // InternalVarlinkIdl.g:11:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:12:7: ( 'type' )
            // InternalVarlinkIdl.g:12:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:13:7: ( '(' )
            // InternalVarlinkIdl.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:14:7: ( ',' )
            // InternalVarlinkIdl.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:15:7: ( ')' )
            // InternalVarlinkIdl.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:16:7: ( ':' )
            // InternalVarlinkIdl.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:17:7: ( '[]' )
            // InternalVarlinkIdl.g:17:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:18:7: ( 'bool' )
            // InternalVarlinkIdl.g:18:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:19:7: ( 'int' )
            // InternalVarlinkIdl.g:19:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:20:7: ( 'float' )
            // InternalVarlinkIdl.g:20:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:21:7: ( 'string' )
            // InternalVarlinkIdl.g:21:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:22:7: ( 'data' )
            // InternalVarlinkIdl.g:22:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:23:7: ( 'object' )
            // InternalVarlinkIdl.g:23:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:24:7: ( 'method' )
            // InternalVarlinkIdl.g:24:9: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:25:7: ( '->' )
            // InternalVarlinkIdl.g:25:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:26:7: ( 'error' )
            // InternalVarlinkIdl.g:26:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:27:7: ( '.' )
            // InternalVarlinkIdl.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:849:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVarlinkIdl.g:849:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalVarlinkIdl.g:849:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVarlinkIdl.g:849:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalVarlinkIdl.g:849:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVarlinkIdl.g:849:40: ( '\\r' )? '\\n'
                    {
                    // InternalVarlinkIdl.g:849:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalVarlinkIdl.g:849:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:851:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVarlinkIdl.g:851:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVarlinkIdl.g:851:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVarlinkIdl.g:851:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalVarlinkIdl.g:851:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVarlinkIdl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:853:10: ( ( '0' .. '9' )+ )
            // InternalVarlinkIdl.g:853:12: ( '0' .. '9' )+
            {
            // InternalVarlinkIdl.g:853:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVarlinkIdl.g:853:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:855:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVarlinkIdl.g:855:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVarlinkIdl.g:855:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVarlinkIdl.g:855:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVarlinkIdl.g:855:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVarlinkIdl.g:855:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVarlinkIdl.g:855:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalVarlinkIdl.g:855:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVarlinkIdl.g:855:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVarlinkIdl.g:855:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVarlinkIdl.g:855:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:857:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVarlinkIdl.g:857:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVarlinkIdl.g:857:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVarlinkIdl.g:857:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:859:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVarlinkIdl.g:859:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVarlinkIdl.g:859:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVarlinkIdl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:861:16: ( . )
            // InternalVarlinkIdl.g:861:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalVarlinkIdl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=24;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalVarlinkIdl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalVarlinkIdl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalVarlinkIdl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalVarlinkIdl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalVarlinkIdl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalVarlinkIdl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalVarlinkIdl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalVarlinkIdl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalVarlinkIdl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalVarlinkIdl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalVarlinkIdl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalVarlinkIdl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalVarlinkIdl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalVarlinkIdl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalVarlinkIdl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalVarlinkIdl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalVarlinkIdl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalVarlinkIdl.g:1:112: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalVarlinkIdl.g:1:128: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalVarlinkIdl.g:1:136: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalVarlinkIdl.g:1:145: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalVarlinkIdl.g:1:157: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalVarlinkIdl.g:1:173: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // InternalVarlinkIdl.g:1:181: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\33\4\uffff\1\31\6\33\1\31\1\33\2\uffff\1\31\2\uffff\3\31\2\uffff\1\33\1\uffff\1\33\5\uffff\6\33\1\uffff\1\33\6\uffff\1\72\11\33\1\uffff\1\104\1\105\2\33\1\110\4\33\2\uffff\1\115\1\33\1\uffff\2\33\1\121\1\33\1\uffff\1\123\1\124\1\125\1\uffff\1\33\3\uffff\1\33\1\130\1\uffff";
    static final String DFA12_eofS =
        "\131\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\1\171\4\uffff\1\135\1\157\1\154\1\164\1\141\1\142\1\145\1\76\1\162\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\160\5\uffff\2\157\1\162\1\164\1\152\1\164\1\uffff\1\162\6\uffff\1\60\1\145\1\154\1\141\1\151\1\141\1\145\1\150\1\157\1\162\1\uffff\2\60\1\164\1\156\1\60\1\143\1\157\1\162\1\146\2\uffff\1\60\1\147\1\uffff\1\164\1\144\1\60\1\141\1\uffff\3\60\1\uffff\1\143\3\uffff\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\171\4\uffff\1\135\1\157\1\154\1\164\1\141\1\142\1\145\1\76\1\162\2\uffff\1\172\2\uffff\2\uffff\1\52\2\uffff\1\164\1\uffff\1\160\5\uffff\2\157\1\162\1\164\1\152\1\164\1\uffff\1\162\6\uffff\1\172\1\145\1\154\1\141\1\151\1\141\1\145\1\150\1\157\1\162\1\uffff\2\172\1\164\1\156\1\172\1\143\1\157\1\162\1\146\2\uffff\1\172\1\147\1\uffff\1\164\1\144\1\172\1\141\1\uffff\3\172\1\uffff\1\143\3\uffff\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\11\uffff\1\21\1\22\1\uffff\1\23\1\24\3\uffff\1\27\1\30\1\uffff\1\23\1\uffff\1\3\1\4\1\5\1\6\1\7\6\uffff\1\17\1\uffff\1\21\1\22\1\24\1\25\1\26\1\27\12\uffff\1\11\11\uffff\1\2\1\10\2\uffff\1\14\4\uffff\1\12\3\uffff\1\20\1\uffff\1\13\1\15\1\16\2\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\24\uffff\1\0\1\1\102\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\1\21\3\31\1\26\1\3\1\5\2\31\1\4\1\16\1\20\1\27\12\24\1\6\6\31\32\23\1\7\2\31\1\22\1\23\1\31\1\23\1\10\1\23\1\13\1\17\1\11\2\23\1\1\3\23\1\15\1\23\1\14\3\23\1\12\1\2\6\23\uff85\31",
            "\1\32",
            "\1\34",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\55",
            "\0\55",
            "\1\56",
            "",
            "",
            "\1\60",
            "",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\71\25\33",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\106",
            "\1\107",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\122",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\126",
            "",
            "",
            "",
            "\1\127",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFF')) ) {s = 45;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 45;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='(') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0==')') ) {s = 5;}

                        else if ( (LA12_0==':') ) {s = 6;}

                        else if ( (LA12_0=='[') ) {s = 7;}

                        else if ( (LA12_0=='b') ) {s = 8;}

                        else if ( (LA12_0=='f') ) {s = 9;}

                        else if ( (LA12_0=='s') ) {s = 10;}

                        else if ( (LA12_0=='d') ) {s = 11;}

                        else if ( (LA12_0=='o') ) {s = 12;}

                        else if ( (LA12_0=='m') ) {s = 13;}

                        else if ( (LA12_0=='-') ) {s = 14;}

                        else if ( (LA12_0=='e') ) {s = 15;}

                        else if ( (LA12_0=='.') ) {s = 16;}

                        else if ( (LA12_0=='#') ) {s = 17;}

                        else if ( (LA12_0=='^') ) {s = 18;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||LA12_0=='c'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||LA12_0=='n'||(LA12_0>='p' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='z')) ) {s = 19;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 20;}

                        else if ( (LA12_0=='\"') ) {s = 21;}

                        else if ( (LA12_0=='\'') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='\\' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}