package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class223 extends Node {

  @ObfuscatedName("w")
  byte[] field2546;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  HashMap field2547;

  @ObfuscatedSignature(
      signature = "(Lgk;)V"
  )
  class223(Buffer class182_1) {
    class182_1.offset = class182_1.bytes.length - 3;
    int i_2 = class182_1.getUInt8();
    int i_3 = class182_1.getUInt16();
    int i_4 = i_2 * 10 + 14;
    class182_1.offset = 0;
    int i_5 = 0;
    int i_6 = 0;
    int i_7 = 0;
    int i_8 = 0;
    int i_9 = 0;
    int i_10 = 0;
    int i_11 = 0;
    int i_12 = 0;

    int i_13;
    int i_14;
    int i_15;
    for (i_13 = 0; i_13 < i_2; i_13++) {
      i_14 = -1;

      while (true) {
        i_15 = class182_1.getUInt8();
        if (i_15 != i_14) {
          ++i_4;
        }

        i_14 = i_15 & 0xf;
        if (i_15 == 7) {
          break;
        }

        if (i_15 == 23) {
          ++i_5;
        } else if (i_14 == 0) {
          ++i_7;
        } else if (i_14 == 1) {
          ++i_8;
        } else if (i_14 == 2) {
          ++i_6;
        } else if (i_14 == 3) {
          ++i_9;
        } else if (i_14 == 4) {
          ++i_10;
        } else if (i_14 == 5) {
          ++i_11;
        } else {
          if (i_14 != 6) {
            throw new RuntimeException();
          }

          ++i_12;
        }
      }
    }

    i_4 += i_5 * 5;
    i_4 += (i_7 + i_8 + i_6 + i_9 + i_11) * 2;
    i_4 = i_4 + i_10 + i_12;
    i_13 = class182_1.offset;
    i_14 = i_2 + i_5 + i_6 + i_7 + i_8 + i_9 + i_10 + i_11 + i_12;

    for (i_15 = 0; i_15 < i_14; i_15++) {
      class182_1.method3566();
    }

    i_4 += class182_1.offset - i_13;
    i_15 = class182_1.offset;
    int i_16 = 0;
    int i_17 = 0;
    int i_18 = 0;
    int i_19 = 0;
    int i_20 = 0;
    int i_21 = 0;
    int i_22 = 0;
    int i_23 = 0;
    int i_24 = 0;
    int i_25 = 0;
    int i_26 = 0;
    int i_27 = 0;
    int i_28 = 0;

    int i_29;
    for (i_29 = 0; i_29 < i_6; i_29++) {
      i_28 = i_28 + class182_1.getUInt8() & 0x7f;
      if (i_28 != 0 && i_28 != 32) {
        if (i_28 == 1) {
          ++i_16;
        } else if (i_28 == 33) {
          ++i_17;
        } else if (i_28 == 7) {
          ++i_18;
        } else if (i_28 == 39) {
          ++i_19;
        } else if (i_28 == 10) {
          ++i_20;
        } else if (i_28 == 42) {
          ++i_21;
        } else if (i_28 == 99) {
          ++i_22;
        } else if (i_28 == 98) {
          ++i_23;
        } else if (i_28 == 101) {
          ++i_24;
        } else if (i_28 == 100) {
          ++i_25;
        } else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123) {
          ++i_27;
        } else {
          ++i_26;
        }
      } else {
        ++i_12;
      }
    }

    i_29 = 0;
    int i_30 = class182_1.offset;
    class182_1.offset += i_26;
    int i_31 = class182_1.offset;
    class182_1.offset += i_11;
    int i_32 = class182_1.offset;
    class182_1.offset += i_10;
    int i_33 = class182_1.offset;
    class182_1.offset += i_9;
    int i_34 = class182_1.offset;
    class182_1.offset += i_16;
    int i_35 = class182_1.offset;
    class182_1.offset += i_18;
    int i_36 = class182_1.offset;
    class182_1.offset += i_20;
    int i_37 = class182_1.offset;
    class182_1.offset += i_7 + i_8 + i_11;
    int i_38 = class182_1.offset;
    class182_1.offset += i_7;
    int i_39 = class182_1.offset;
    class182_1.offset += i_27;
    int i_40 = class182_1.offset;
    class182_1.offset += i_8;
    int i_41 = class182_1.offset;
    class182_1.offset += i_17;
    int i_42 = class182_1.offset;
    class182_1.offset += i_19;
    int i_43 = class182_1.offset;
    class182_1.offset += i_21;
    int i_44 = class182_1.offset;
    class182_1.offset += i_12;
    int i_45 = class182_1.offset;
    class182_1.offset += i_9;
    int i_46 = class182_1.offset;
    class182_1.offset += i_22;
    int i_47 = class182_1.offset;
    class182_1.offset += i_23;
    int i_48 = class182_1.offset;
    class182_1.offset += i_24;
    int i_49 = class182_1.offset;
    class182_1.offset += i_25;
    int i_50 = class182_1.offset;
    class182_1.offset += i_5 * 3;
    this.field2546 = new byte[i_4];
    Buffer class182_51 = new Buffer(this.field2546);
    class182_51.putInt32(1297377380);
    class182_51.putInt32(6);
    class182_51.method3755(i_2 > 1 ? 1 : 0);
    class182_51.method3755(i_2);
    class182_51.method3755(i_3);
    class182_1.offset = i_13;
    int i_52 = 0;
    int i_53 = 0;
    int i_54 = 0;
    int i_55 = 0;
    int i_56 = 0;
    int i_57 = 0;
    int i_58 = 0;
    int[] ints_59 = new int[128];
    i_28 = 0;

    label230:
    for (int i_60 = 0; i_60 < i_2; i_60++) {
      class182_51.putInt32(1297379947);
      class182_51.offset += 4;
      int i_61 = class182_51.offset;
      int i_62 = -1;

      while (true) {
        while (true) {
          int i_63 = class182_1.method3566();
          class182_51.method3688(i_63);
          int i_64 = class182_1.bytes[i_29++] & 0xff;
          boolean bool_65 = i_64 != i_62;
          i_62 = i_64 & 0xf;
          if (i_64 == 7) {
            if (bool_65) {
              class182_51.putInt8(255);
            }

            class182_51.putInt8(47);
            class182_51.putInt8(0);
            class182_51.method3543(class182_51.offset - i_61);
            continue label230;
          }

          if (i_64 == 23) {
            if (bool_65) {
              class182_51.putInt8(255);
            }

            class182_51.putInt8(81);
            class182_51.putInt8(3);
            class182_51.putInt8(class182_1.bytes[i_50++]);
            class182_51.putInt8(class182_1.bytes[i_50++]);
            class182_51.putInt8(class182_1.bytes[i_50++]);
          } else {
            i_52 ^= i_64 >> 4;
            if (i_62 == 0) {
              if (bool_65) {
                class182_51.putInt8(i_52 + 144);
              }

              i_53 += class182_1.bytes[i_37++];
              i_54 += class182_1.bytes[i_38++];
              class182_51.putInt8(i_53 & 0x7f);
              class182_51.putInt8(i_54 & 0x7f);
            } else if (i_62 == 1) {
              if (bool_65) {
                class182_51.putInt8(i_52 + 128);
              }

              i_53 += class182_1.bytes[i_37++];
              i_55 += class182_1.bytes[i_40++];
              class182_51.putInt8(i_53 & 0x7f);
              class182_51.putInt8(i_55 & 0x7f);
            } else if (i_62 == 2) {
              if (bool_65) {
                class182_51.putInt8(i_52 + 176);
              }

              i_28 = i_28 + class182_1.bytes[i_15++] & 0x7f;
              class182_51.putInt8(i_28);
              byte b_66;
              if (i_28 != 0 && i_28 != 32) {
                if (i_28 == 1) {
                  b_66 = class182_1.bytes[i_34++];
                } else if (i_28 == 33) {
                  b_66 = class182_1.bytes[i_41++];
                } else if (i_28 == 7) {
                  b_66 = class182_1.bytes[i_35++];
                } else if (i_28 == 39) {
                  b_66 = class182_1.bytes[i_42++];
                } else if (i_28 == 10) {
                  b_66 = class182_1.bytes[i_36++];
                } else if (i_28 == 42) {
                  b_66 = class182_1.bytes[i_43++];
                } else if (i_28 == 99) {
                  b_66 = class182_1.bytes[i_46++];
                } else if (i_28 == 98) {
                  b_66 = class182_1.bytes[i_47++];
                } else if (i_28 == 101) {
                  b_66 = class182_1.bytes[i_48++];
                } else if (i_28 == 100) {
                  b_66 = class182_1.bytes[i_49++];
                } else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123) {
                  b_66 = class182_1.bytes[i_39++];
                } else {
                  b_66 = class182_1.bytes[i_30++];
                }
              } else {
                b_66 = class182_1.bytes[i_44++];
              }

              int i_67 = b_66 + ints_59[i_28];
              ints_59[i_28] = i_67;
              class182_51.putInt8(i_67 & 0x7f);
            } else if (i_62 == 3) {
              if (bool_65) {
                class182_51.putInt8(i_52 + 224);
              }

              i_56 += class182_1.bytes[i_45++];
              i_56 += class182_1.bytes[i_33++] << 7;
              class182_51.putInt8(i_56 & 0x7f);
              class182_51.putInt8(i_56 >> 7 & 0x7f);
            } else if (i_62 == 4) {
              if (bool_65) {
                class182_51.putInt8(i_52 + 208);
              }

              i_57 += class182_1.bytes[i_32++];
              class182_51.putInt8(i_57 & 0x7f);
            } else if (i_62 == 5) {
              if (bool_65) {
                class182_51.putInt8(i_52 + 160);
              }

              i_53 += class182_1.bytes[i_37++];
              i_58 += class182_1.bytes[i_31++];
              class182_51.putInt8(i_53 & 0x7f);
              class182_51.putInt8(i_58 & 0x7f);
            } else {
              if (i_62 != 6) {
                throw new RuntimeException();
              }

              if (bool_65) {
                class182_51.putInt8(i_52 + 192);
              }

              class182_51.putInt8(class182_1.bytes[i_44++]);
            }
          }
        }
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;II)Lhq;"
  )
  static class223 method4415(AbstractPack class247_0, int i_1, int i_2) {
    byte[] bytes_3 = class247_0.method4625(i_1, i_2);
    return bytes_3 == null ? null : new class223(new Buffer(bytes_3));
  }

  @ObfuscatedName("w")
  void method4412() {
    if (this.field2547 == null) {
      this.field2547 = new HashMap(16);
      int[] ints_1 = new int[16];
      int[] ints_2 = new int[16];
      ints_2[9] = 128;
      ints_1[9] = 128;
      class220 class220_4 = new class220(this.field2546);
      int i_5 = class220_4.method4331();

      int i_6;
      for (i_6 = 0; i_6 < i_5; i_6++) {
        class220_4.method4350(i_6);
        class220_4.method4335(i_6);
        class220_4.method4333(i_6);
      }

      label52:
      do {
        while (true) {
          i_6 = class220_4.method4339();
          int i_7 = class220_4.field2525[i_6];

          while (i_7 == class220_4.field2525[i_6]) {
            class220_4.method4350(i_6);
            int i_8 = class220_4.method4336(i_6);
            if (i_8 == 1) {
              class220_4.method4334();
              class220_4.method4333(i_6);
              continue label52;
            }

            int i_9 = i_8 & 0xf0;
            int i_10;
            int i_11;
            int i_12;
            if (i_9 == 176) {
              i_10 = i_8 & 0xf;
              i_11 = i_8 >> 8 & 0x7f;
              i_12 = i_8 >> 16 & 0x7f;
              if (i_11 == 0) {
                ints_1[i_10] = (i_12 << 14) + (ints_1[i_10] & ~0x1fc000);
              }

              if (i_11 == 32) {
                ints_1[i_10] = (ints_1[i_10] & ~0x3f80) + (i_12 << 7);
              }
            }

            if (i_9 == 192) {
              i_10 = i_8 & 0xf;
              i_11 = i_8 >> 8 & 0x7f;
              ints_2[i_10] = i_11 + ints_1[i_10];
            }

            if (i_9 == 144) {
              i_10 = i_8 & 0xf;
              i_11 = i_8 >> 8 & 0x7f;
              i_12 = i_8 >> 16 & 0x7f;
              if (i_12 > 0) {
                int i_13 = ints_2[i_10];
                class213 class213_14 = (class213) this.field2547.get((long) i_13);
                if (class213_14 == null) {
                  class213_14 = new class213(new byte[128]);
                  this.field2547.put(class213_14, (long) i_13);
                }

                class213_14.field2440[i_11] = 1;
              }
            }

            class220_4.method4335(i_6);
            class220_4.method4333(i_6);
          }
        }
      } while (!class220_4.method4340());

    }
  }

  @ObfuscatedName("s")
  void method4413() {
    this.field2547 = null;
  }

}
