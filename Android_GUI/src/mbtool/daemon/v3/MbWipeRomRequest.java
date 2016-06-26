// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MbWipeRomRequest extends Table {
  public static MbWipeRomRequest getRootAsMbWipeRomRequest(ByteBuffer _bb) { return getRootAsMbWipeRomRequest(_bb, new MbWipeRomRequest()); }
  public static MbWipeRomRequest getRootAsMbWipeRomRequest(ByteBuffer _bb, MbWipeRomRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MbWipeRomRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String romId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer romIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public short targets(int j) { int o = __offset(6); return o != 0 ? bb.getShort(__vector(o) + j * 2) : 0; }
  public int targetsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer targetsAsByteBuffer() { return __vector_as_bytebuffer(6, 2); }

  public static int createMbWipeRomRequest(FlatBufferBuilder builder,
      int rom_idOffset,
      int targetsOffset) {
    builder.startObject(2);
    MbWipeRomRequest.addTargets(builder, targetsOffset);
    MbWipeRomRequest.addRomId(builder, rom_idOffset);
    return MbWipeRomRequest.endMbWipeRomRequest(builder);
  }

  public static void startMbWipeRomRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addRomId(FlatBufferBuilder builder, int romIdOffset) { builder.addOffset(0, romIdOffset, 0); }
  public static void addTargets(FlatBufferBuilder builder, int targetsOffset) { builder.addOffset(1, targetsOffset, 0); }
  public static int createTargetsVector(FlatBufferBuilder builder, short[] data) { builder.startVector(2, data.length, 2); for (int i = data.length - 1; i >= 0; i--) builder.addShort(data[i]); return builder.endVector(); }
  public static void startTargetsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(2, numElems, 2); }
  public static int endMbWipeRomRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

