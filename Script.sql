--------------------------------------------------------
--  DDL for Table CINEMA
--------------------------------------------------------

  CREATE TABLE "CINEMA" 
   (	"ID" NUMBER, 
        "MOVIE_NAME" VARCHAR2(500 BYTE)
   );
--------------------------------------------------------
--  DDL for Index MOVIE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MOVIE_PK" ON "CINEMA" ("ID");
--------------------------------------------------------
--  Constraints for Table CINEMA
--------------------------------------------------------

  ALTER TABLE "CINEMA" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "CINEMA" MODIFY ("MOVIE_NAME" NOT NULL ENABLE);
  ALTER TABLE "CINEMA" ADD CONSTRAINT "MOVIE_PK" PRIMARY KEY ("ID");