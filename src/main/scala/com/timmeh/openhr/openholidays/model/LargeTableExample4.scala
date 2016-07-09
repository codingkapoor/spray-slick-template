package com.timmeh.openhr.openholidays.model

import com.timmeh.openhr.openholidays.model.Helpers.BigHList
import slick.collection.heterogeneous._
import slick.collection.heterogeneous.syntax._
import slick.driver.H2Driver.api._

// Alias this type so we don't have to keep repeating it in method definitions
object Helpers {
  type BigHList =
  Int ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    String ::
    HNil
}

//// This file demonstrates how to map more than 22 columns to a nested case class using a HList
class LargeTableExample4(tag: Tag)
  extends Table[Helpers.BigHList](tag, "LARGE_TABLE") {
  def id = column[Int]("ID", O.PrimaryKey)
  def a = column[String]("A")
  def b = column[String]("B")
  def c = column[String]("C")
  def d = column[String]("D")

  def e = column[String]("E")
  def f = column[String]("F")
  def g = column[String]("G")
  def h = column[String]("H")
  def i = column[String]("I")

  def j = column[String]("J")
  def k = column[String]("K")
  def l = column[String]("L")
  def m = column[String]("M")
  def n = column[String]("N")

  def o = column[String]("O")
  def p = column[String]("P")
  def q = column[String]("Q")
  def r = column[String]("R")
  def s = column[String]("S")

  def t = column[String]("T")
  def u = column[String]("U")
  def v = column[String]("V")
  def w = column[String]("W")
  def x = column[String]("X")

  def y = column[String]("Y")
  def z = column[String]("Z")

  def * = (
    id ::
    a ::
    b ::
    c ::
    d ::
    e ::
    f ::
    g ::
    h ::
    i ::
    j ::
    k ::
    l ::
    m ::
    n ::
    o ::
    p ::
    q ::
    r ::
    s ::
    t ::
    u ::
    v ::
    w ::
    x ::
    y ::
    z ::
    HNil
    )
}