package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/CannotProceedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u171/10807/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, March 28, 2018 12:52:40 PM PDT
*/

public final class CannotProceedHolder implements org.omg.CORBA.portable.Streamable
{
  public CannotProceed value = null;

  public CannotProceedHolder ()
  {
  }

  public CannotProceedHolder (CannotProceed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CannotProceedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CannotProceedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CannotProceedHelper.type ();
  }

}