// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MbGetInstalledRomsResponse extends Table {
  public static MbGetInstalledRomsResponse getRootAsMbGetInstalledRomsResponse(ByteBuffer _bb) { return getRootAsMbGetInstalledRomsResponse(_bb, new MbGetInstalledRomsResponse()); }
  public static MbGetInstalledRomsResponse getRootAsMbGetInstalledRomsResponse(ByteBuffer _bb, MbGetInstalledRomsResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MbGetInstalledRomsResponse __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public MbRom roms(int j) { return roms(new MbRom(), j); }
  public MbRom roms(MbRom obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int romsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createMbGetInstalledRomsResponse(FlatBufferBuilder builder,
      int romsOffset) {
    builder.startObject(1);
    MbGetInstalledRomsResponse.addRoms(builder, romsOffset);
    return MbGetInstalledRomsResponse.endMbGetInstalledRomsResponse(builder);
  }

  public static void startMbGetInstalledRomsResponse(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addRoms(FlatBufferBuilder builder, int romsOffset) { builder.addOffset(0, romsOffset, 0); }
  public static int createRomsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRomsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMbGetInstalledRomsResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

