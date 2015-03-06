// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class NotRedacted extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_A = "";
  public static final String DEFAULT_B = "";

  @ProtoField(tag = 1, type = STRING)
  public final String a;

  @ProtoField(tag = 2, type = STRING)
  public final String b;

  public NotRedacted(String a, String b) {
    this.a = a;
    this.b = b;
  }

  private NotRedacted(Builder builder) {
    this(builder.a, builder.b);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof NotRedacted)) return false;
    NotRedacted o = (NotRedacted) other;
    return equals(a, o.a)
        && equals(b, o.b);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = a != null ? a.hashCode() : 0;
      result = result * 37 + (b != null ? b.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<NotRedacted> {

    public String a;
    public String b;

    public Builder() {
    }

    public Builder(NotRedacted message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
      this.b = message.b;
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    public Builder b(String b) {
      this.b = b;
      return this;
    }

    @Override
    public NotRedacted build() {
      return new NotRedacted(this);
    }
  }
}
