# Lang
we need a better name smh

let's use this document to discuss syntax ideas: https://docs.google.com/document/d/1eNeSSMnlMNSkM4xektrmp8_bbR6eQbCCMdRBLU7MqPI/edit

we are planning on writing a language that resembles the oldest programming languages but retains the functionality of a modern language
it will be more verbose than most modern code, but this will enhance readability and will hopefully make it easier to write and debug

so far, our syntax is as such (though none of this is implemented):

operators:
	we will support the standard binary operators +, -, \*, and /, along with ^ for exponentiation

type system:
	variables will be declared with var or const
	the type of the variable will be inferred from its initial assignment, which must occur with the definition of the variable
	operators may be defined for various combinations of types; we may choose to enable operator overloading

assignment:
	the type system will have rules for interconversion of types
	in general, the type of a variable is not required; in this case, the type of a variable may be made more generic at run-time, and can be explicitly cast to a more specific (or more generic) type
	for example:
		var x = 12				// inferred to be an int
		var b = x / 15			// integer division, b is an int
		x = 17.0				// x is now floating point
		var c = x / 20			// c is floating point
		var d = (int) x / 20	// x is temporarily cast to an int, d is an int
		(int) x = c				// x is an integer once again
	attempting to cast a type to another type for which no rule for conversion exists will result in a run time error
	
	a type may be given explicitly to a variable; explicitly given types will operate more efficiently than inferred types, but offer less flexibility

control flow:
	if {condition} then
		// code
	[else
		// code]
	end
	-------------------------------------------------
	do
		// code
	for x from {startnum} to {endnum} step {stepsize}
	-------------------------------------------------
	do
		// code
	x times

functions:
	functions will be called much like in Java or C:
		myfunction(param1, param2)
	
	functions do not need to be defined above their first usage, nor even necessarily in the same file
	
	function definitions shall be as follows:
		function myfunction(param1, param2)
			// code
			[return {expression}]
		end
	the return type of the function is inferred from examination of the types of each return statement; if no return statement is present, the function returns 0
	the types of each parameter are infered by the types of the variables passed to them (as seen at compile time) and by the methods/fields accessed from those parameters
		the most specific type or interface that contains all of the fields and methods used in the function, as well as being compatible with the inferred types of the arguments passed to the function, is the inferred type of the parameter

linking to other languages:
	we will support calling C functions natively
