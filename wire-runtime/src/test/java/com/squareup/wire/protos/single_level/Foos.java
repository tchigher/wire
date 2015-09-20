// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/single_level.proto at 24:1
package com.squareup.wire.protos.single_level;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.util.Collections;
import java.util.List;

public final class Foos extends Message<Foos> {
  public static final ProtoAdapter<Foos> ADAPTER = ProtoAdapter.newMessageAdapter(Foos.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.single_level.Foo#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Foo> foos;

  public Foos(List<Foo> foos) {
    this(foos, TagMap.EMPTY);
  }

  public Foos(List<Foo> foos, TagMap tagMap) {
    super(tagMap);
    this.foos = immutableCopyOf(foos);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foos)) return false;
    Foos o = (Foos) other;
    return equals(tagMap(), o.tagMap())
        && equals(foos, o.foos);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (foos != null ? foos.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Foos, Builder> {
    public List<Foo> foos;

    public Builder() {
      foos = Collections.emptyList();
    }

    public Builder(Foos message) {
      super(message);
      if (message == null) return;
      this.foos = copyOf(message.foos);
    }

    public Builder foos(List<Foo> foos) {
      this.foos = canonicalizeList(foos);
      return this;
    }

    @Override
    public Foos build() {
      return new Foos(foos, buildTagMap());
    }
  }
}
