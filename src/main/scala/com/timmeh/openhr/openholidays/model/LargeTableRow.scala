package com.timmeh.openhr.openholidays.model

// Let's say these are the case classes that you eventually want to map
case class LargeTableRow(idToD: IdToD, eToI: EToI, jToN: JToN, oToS: OToS, tToX: TToX, yToZ: YToZ)
case class IdToD(id: Int, a: String, b: String, c: String, d: String)
case class EToI(e: String, f: String, g: String, h: String, i: String)
case class JToN(j: String, k: String, l: String, m: String, n: String)
case class OToS(o: String, p: String, q: String, r: String, s: String)
case class TToX(t: String, u: String, v: String, w: String, x: String)
case class YToZ(y: String, z: String)
