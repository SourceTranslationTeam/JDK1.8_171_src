package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/NotEmptyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u171/10807/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, March 28, 2018 12:52:40 PM PDT
*/

public final class NotEmptyHolder implements org.omg.CORBA.portable.Streamable
{
  public NotEmpty value = null;

  public NotEmptyHolder ()
  {
  }

  public NotEmptyHolder (NotEmpty initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotEmptyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotEmptyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotEmptyHelper.type ();
  }

}
