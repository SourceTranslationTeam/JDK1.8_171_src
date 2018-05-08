package org.omg.CosNaming;

/**
* org/omg/CosNaming/NamingContextExtHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u171/10807/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, March 28, 2018 12:52:40 PM PDT
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public final class NamingContextExtHolder implements org.omg.CORBA.portable.Streamable
{
  public NamingContextExt value = null;

  public NamingContextExtHolder ()
  {
  }

  public NamingContextExtHolder (NamingContextExt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NamingContextExtHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NamingContextExtHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NamingContextExtHelper.type ();
  }

}
