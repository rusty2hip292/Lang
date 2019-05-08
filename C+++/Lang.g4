grammar Lang;

import Tokens;

program : (oursyntax | c)+;

oursyntax : 'A';

c : ~(oursyntax | program);