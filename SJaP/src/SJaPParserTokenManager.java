/* Generated By:JavaCC: Do not edit this line. SJaPParserTokenManager.java */

/** Token Manager. */
public class SJaPParserTokenManager implements SJaPParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x100L) != 0L)
            return 2;
         if ((active0 & 0x400L) != 0L)
            return 24;
         if ((active0 & 0x1cbfbad000L) != 0L)
         {
            jjmatchedKind = 41;
            return 11;
         }
         if ((active0 & 0x2140410000L) != 0L)
         {
            jjmatchedKind = 41;
            return 15;
         }
         if ((active0 & 0x200042000L) != 0L)
         {
            jjmatchedKind = 41;
            return 20;
         }
         return -1;
      case 1:
         if ((active0 & 0x1020000L) != 0L)
            return 11;
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 19;
         }
         if ((active0 & 0x3cfefdf000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 11;
         }
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 14;
         }
         return -1;
      case 2:
         if ((active0 & 0x38fef4c000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 2;
            }
            return 11;
         }
         if ((active0 & 0x400093000L) != 0L)
            return 11;
         if ((active0 & 0x200000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 2;
            }
            return 18;
         }
         if ((active0 & 0x100000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 2;
            }
            return 13;
         }
         return -1;
      case 3:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 12;
         }
         if ((active0 & 0x1cfef48000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 11;
         }
         if ((active0 & 0x2000004000L) != 0L)
            return 11;
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 17;
         }
         return -1;
      case 4:
         if ((active0 & 0x134e308000L) != 0L)
            return 11;
         if ((active0 & 0xcb0c40000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 4;
            }
            return 11;
         }
         return -1;
      case 5:
         if ((active0 & 0x890440000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
            return 11;
         }
         if ((active0 & 0x420808000L) != 0L)
            return 11;
         return -1;
      case 6:
         if ((active0 & 0x80040000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 6;
            return 11;
         }
         if ((active0 & 0x810400000L) != 0L)
            return 11;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStopAtPos(0, 3);
      case 10:
         return jjStopAtPos(0, 4);
      case 13:
         return jjStopAtPos(0, 2);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x1000000000000000L);
      case 37:
         return jjStopAtPos(0, 11);
      case 40:
         return jjStopAtPos(0, 53);
      case 41:
         return jjStopAtPos(0, 54);
      case 42:
         return jjStopAtPos(0, 9);
      case 43:
         return jjStopAtPos(0, 7);
      case 45:
         return jjStartNfaWithStates_0(0, 8, 2);
      case 47:
         return jjStartNfaWithStates_0(0, 10, 24);
      case 60:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L);
      case 61:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0x800000000000000L);
      case 62:
         jjmatchedKind = 55;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L);
      case 91:
         return jjStopAtPos(0, 51);
      case 93:
         return jjStopAtPos(0, 52);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2008000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200042000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1820000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2140410000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x400181000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 123:
         return jjStopAtPos(0, 48);
      case 125:
         return jjStopAtPos(0, 49);
      case 229:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         else if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         else if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x300080000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80900000L);
      case 102:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 11);
         break;
      case 103:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 11);
         break;
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x1400001000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2002008000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x4002000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x20040000L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 229:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 230:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2010000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4004000L);
      case 107:
         return jjMoveStringLiteralDfa3_0(active0, 0x20100000L);
      case 108:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x602408000L);
      case 109:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 11);
         break;
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x900840000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000200000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x2008000L);
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0x420000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 107:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x14000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 115:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 11);
         return jjMoveStringLiteralDfa4_0(active0, 0x200100000L);
      case 116:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 11);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000800000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x88000000L);
      case 230:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      case 101:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 36, 11);
         break;
      case 102:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 103:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 11);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 107:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 11);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 114:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x80008000L);
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 11);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 11);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(4, 27, 11);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 11);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 11);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 248:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      case 103:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 11);
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x10040000L);
      case 106:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(5, 34, 11);
         break;
      case 108:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 29, 11);
         break;
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 115:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 11);
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000L);
      case 108:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 28, 11);
         break;
      case 110:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 11);
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(7, 18, 11);
         break;
      case 114:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(7, 31, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0x6010019800000000L, 0x100006001000060L
};
static final long[] jjbitVec1 = {
   0x0L, 0x0L, 0x0L, 0x100006001000060L
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 35;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 15:
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(0);
                  }
                  else if ((0x2600L & l) != 0L)
                  {
                     if (kind > 47)
                        kind = 47;
                  }
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(8, 9);
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 2;
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAddTwoStates(3, 4);
                  }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 24:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(30, 31);
                  else if (curChar == 47)
                     jjCheckNAddStates(2, 4);
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAddTwoStates(3, 4);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 44)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if ((0x3fe000000000000L & l) != 0L && kind > 39)
                     kind = 39;
                  break;
               case 7:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 8:
                  if ((0xfffffc7a00000000L & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if (curChar == 34 && kind > 40)
                     kind = 40;
                  break;
               case 22:
                  if ((0x2600L & l) != 0L && kind > 47)
                     kind = 47;
                  break;
               case 23:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 25:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 26:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 27:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 28:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 30:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 31:
                  if (curChar == 42)
                     jjCheckNAddStates(5, 7);
                  break;
               case 32:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(33, 31);
                  break;
               case 33:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(33, 31);
                  break;
               case 34:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 15:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 116)
                  {
                     if (kind > 42)
                        kind = 42;
                  }
                  break;
               case 19:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 20:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 17:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 107)
                  {
                     if (kind > 42)
                        kind = 42;
                  }
                  break;
               case 8:
                  if ((0x57ffffffd7ffffffL & l) != 0L)
                     jjAddStates(8, 9);
                  break;
               case 10:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 11:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 16:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 21:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 25:
                  jjAddStates(2, 4);
                  break;
               case 30:
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
               case 33:
                  jjCheckNAddTwoStates(33, 31);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 15:
               case 11:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 1:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 14:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 13:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 12:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 19:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 18:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 20:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 17:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 9);
                  break;
               case 25:
                  if ((jjbitVec2[i2] & l2) != 0L)
                     jjAddStates(2, 4);
                  break;
               case 30:
                  if ((jjbitVec2[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
               case 33:
                  if ((jjbitVec2[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(33, 31);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 35 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   24, 29, 25, 26, 28, 31, 32, 34, 8, 9, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\53", "\55", "\52", "\57", "\45", 
"\164\151\154", "\146\162\141", "\150\166\151\163", "\145\154\154\145\162\163", 
"\163\157\155", "\141\146", "\146\165\156\153\164\151\157\156", "\164\141\154", 
"\164\145\153\163\164", "\165\144\163\141\147", "\163\345\154\346\156\147\145", 
"\147\145\156\164\141\147", "\157\147", "\145\154\154\145\162", "\160\162\151\156\164", 
"\151\156\160\165\164", "\345\142\145\156\146\151\154", "\154\165\153\146\151\154", 
"\163\164\141\162\164", "\162\145\164\165\162\156\145\162", "\163\141\156\144\164", 
"\146\141\154\163\153", "\164\151\154\146\370\152", "\154\346\156\147\144\145\156", 
"\154\151\163\164\145", "\163\154\145\164", null, null, null, null, null, null, null, null, null, null, 
"\173", "\175", "\75", "\133", "\135", "\50", "\51", "\76", "\74", "\76\75", "\74\75", 
"\75\75", "\41\75", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fff87ffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[35];
static private final int[] jjstateSet = new int[70];
static protected char curChar;
/** Constructor. */
public SJaPParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public SJaPParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 35; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000000L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
