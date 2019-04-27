# Lang
we need a better name smh

let's use this document to discuss syntax ideas: https://docs.google.com/document/d/1eNeSSMnlMNSkM4xektrmp8_bbR6eQbCCMdRBLU7MqPI/edit

the syntax needs to be figured out but so far I've started working on a type system with type (typedef), class (will support inheritance, polymorphism, etc),
and struct (rn the plan is to be the same as C structs, but we might make it so that its a class but without the overhead needed to implement the more dynamic features of oop)

each type definition also supports a hide modifier ("hide class myclass") which makes that type local to the file
