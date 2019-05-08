grammar Lang;

import Tokens;

program : (c|mysyntax)+;

mysyntax : 'b';



// we are assuming anything we don't explicitly handle is valid c
c : anything+;
anything : ANYTHING+;