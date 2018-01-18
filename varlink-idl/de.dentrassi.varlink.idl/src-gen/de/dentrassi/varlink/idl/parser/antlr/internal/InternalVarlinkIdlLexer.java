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
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__22=22;
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

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:11:6: ( 'interface' )
            // InternalVarlinkIdl.g:11:8: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:12:6: ( 'type' )
            // InternalVarlinkIdl.g:12:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:28:7: ( 'enum' )
            // InternalVarlinkIdl.g:28:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:978:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVarlinkIdl.g:978:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalVarlinkIdl.g:978:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:980:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVarlinkIdl.g:980:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalVarlinkIdl.g:980:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVarlinkIdl.g:980:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);

            // InternalVarlinkIdl.g:980:39: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVarlinkIdl.g:980:40: ( '\\r' )? '\\n'
                    {
                    // InternalVarlinkIdl.g:980:40: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalVarlinkIdl.g:980:40: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVarlinkIdl.g:982:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVarlinkIdl.g:982:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVarlinkIdl.g:982:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalVarlinkIdl.g:984:16: ( . )
            // InternalVarlinkIdl.g:984:18: .
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
        // InternalVarlinkIdl.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt6=22;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalVarlinkIdl.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalVarlinkIdl.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalVarlinkIdl.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalVarlinkIdl.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // InternalVarlinkIdl.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // InternalVarlinkIdl.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // InternalVarlinkIdl.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // InternalVarlinkIdl.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // InternalVarlinkIdl.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // InternalVarlinkIdl.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // InternalVarlinkIdl.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // InternalVarlinkIdl.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // InternalVarlinkIdl.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // InternalVarlinkIdl.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // InternalVarlinkIdl.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // InternalVarlinkIdl.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // InternalVarlinkIdl.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // InternalVarlinkIdl.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // InternalVarlinkIdl.g:1:116: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalVarlinkIdl.g:1:124: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalVarlinkIdl.g:1:140: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalVarlinkIdl.g:1:148: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\2\26\4\uffff\1\24\6\26\1\24\1\26\5\uffff\1\26\1\uffff\1\26\5\uffff\6\26\1\uffff\2\26\3\uffff\1\64\12\26\1\uffff\1\77\1\100\2\26\1\103\3\26\1\107\1\26\2\uffff\1\111\1\26\1\uffff\2\26\1\115\1\uffff\1\26\1\uffff\1\117\1\120\1\121\1\uffff\1\26\3\uffff\1\26\1\124\1\uffff";
    static final String DFA6_eofS =
        "\125\uffff";
    static final String DFA6_minS =
        "\1\0\1\156\1\171\4\uffff\1\135\1\157\1\154\1\164\1\141\1\142\1\145\1\76\1\156\5\uffff\1\164\1\uffff\1\160\5\uffff\2\157\1\162\1\164\1\152\1\164\1\uffff\1\162\1\165\3\uffff\1\60\1\145\1\154\1\141\1\151\1\141\1\145\1\150\1\157\1\155\1\162\1\uffff\2\60\1\164\1\156\1\60\1\143\1\157\1\162\1\60\1\146\2\uffff\1\60\1\147\1\uffff\1\164\1\144\1\60\1\uffff\1\141\1\uffff\3\60\1\uffff\1\143\3\uffff\1\145\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\uffff\1\156\1\171\4\uffff\1\135\1\157\1\154\1\164\1\141\1\142\1\145\1\76\1\162\5\uffff\1\164\1\uffff\1\160\5\uffff\2\157\1\162\1\164\1\152\1\164\1\uffff\1\162\1\165\3\uffff\1\172\1\145\1\154\1\141\1\151\1\141\1\145\1\150\1\157\1\155\1\162\1\uffff\2\172\1\164\1\156\1\172\1\143\1\157\1\162\1\172\1\146\2\uffff\1\172\1\147\1\uffff\1\164\1\144\1\172\1\uffff\1\141\1\uffff\3\172\1\uffff\1\143\3\uffff\1\145\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\11\uffff\1\21\1\23\1\24\1\25\1\26\1\uffff\1\23\1\uffff\1\3\1\4\1\5\1\6\1\7\6\uffff\1\17\2\uffff\1\21\1\24\1\25\13\uffff\1\11\12\uffff\1\2\1\10\2\uffff\1\14\3\uffff\1\22\1\uffff\1\12\3\uffff\1\20\1\uffff\1\13\1\15\1\16\2\uffff\1\1";
    static final String DFA6_specialS =
        "\1\0\124\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\2\24\1\22\4\24\1\3\1\5\2\24\1\4\1\16\1\20\13\24\1\6\6\24\32\21\1\7\3\24\1\21\1\24\1\21\1\10\1\21\1\13\1\17\1\11\2\21\1\1\3\21\1\15\1\21\1\14\3\21\1\12\1\2\6\21\uff85\24",
            "\1\25",
            "\1\27",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\45\3\uffff\1\44",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\63\25\26",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\101",
            "\1\102",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\110",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\116",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\122",
            "",
            "",
            "",
            "\1\123",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='i') ) {s = 1;}

                        else if ( (LA6_0=='t') ) {s = 2;}

                        else if ( (LA6_0=='(') ) {s = 3;}

                        else if ( (LA6_0==',') ) {s = 4;}

                        else if ( (LA6_0==')') ) {s = 5;}

                        else if ( (LA6_0==':') ) {s = 6;}

                        else if ( (LA6_0=='[') ) {s = 7;}

                        else if ( (LA6_0=='b') ) {s = 8;}

                        else if ( (LA6_0=='f') ) {s = 9;}

                        else if ( (LA6_0=='s') ) {s = 10;}

                        else if ( (LA6_0=='d') ) {s = 11;}

                        else if ( (LA6_0=='o') ) {s = 12;}

                        else if ( (LA6_0=='m') ) {s = 13;}

                        else if ( (LA6_0=='-') ) {s = 14;}

                        else if ( (LA6_0=='e') ) {s = 15;}

                        else if ( (LA6_0=='.') ) {s = 16;}

                        else if ( ((LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||LA6_0=='a'||LA6_0=='c'||(LA6_0>='g' && LA6_0<='h')||(LA6_0>='j' && LA6_0<='l')||LA6_0=='n'||(LA6_0>='p' && LA6_0<='r')||(LA6_0>='u' && LA6_0<='z')) ) {s = 17;}

                        else if ( (LA6_0=='#') ) {s = 18;}

                        else if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {s = 19;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='!' && LA6_0<='\"')||(LA6_0>='$' && LA6_0<='\'')||(LA6_0>='*' && LA6_0<='+')||(LA6_0>='/' && LA6_0<='9')||(LA6_0>=';' && LA6_0<='@')||(LA6_0>='\\' && LA6_0<='^')||LA6_0=='`'||(LA6_0>='{' && LA6_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}