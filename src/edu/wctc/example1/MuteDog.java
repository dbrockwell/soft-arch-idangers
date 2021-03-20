package edu.wctc.example1;

/*
 This class inherits all the default behaviors (methods) from Animal. Nothing
 is overridden. So far so good ... the default speak() implementation is to be
 "[mute]".
 *
 But do we always want this displayed in a JOptionPane? Did the
 author of the MuteDog class even know this would be the result? It depends on
 how many methods are in the superclass. If there are many, that is a big job.
 Will you always do the research? Chances are you won't.
 */
public class MuteDog extends Animal {

}
