<<<<<<< HEAD
# java-racingcar-precourse

## 기능
- 자동차 이름과 실행 횟수를 부여받는다.
    - 자동차 이름은 쉼표(,)를 기준으로 구분하고 5자 이하만 가능하다.
- 주어진 횟수 동아 n 대의 자동차는 전진하거나 멈춰있는다.
    - 0-9 사이의 무작위 값을 구한 후 그 값이 4 이상인 경우 전진한다.
- 실행이 한 번 끝날 때마다 실행결과를 출력하고 이때 자동차 이름을 같이 출력한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
    - 공동 우승의 경우 쉼표(,)를 사용해 구분한다
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다

## 실행 방법
- 경주할 자동차 이름을 입력한다
    - 자동차 이름을 쉼표(,) 기준으로 구분한다
- 시도할 횟수를 입력한다
- 차수별 실행 결과를 출력한다
    - 진출한만큼 -로 표시한다
- 우승자를 출력한다
    - 공동 우승의 경우 쉼표(,)로 구분해 출력한다

## 구현할 기능 목록
- 자동차 이름 입력 받기
- 실행 횟수 입력 받기
- 조건에 따라 전진하기
- 실행 결과 출력하기
- 우승자 판별하기
- 우승자 출력하기

## 완료된 기능

## 기타
- 잘못된 값 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료

=======
{\rtf1\ansi\ansicpg949\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset129 AppleSDGothicNeo-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{hyphen\}}{\leveltext\leveltemplateid1\'01\uc0\u8259 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{hyphen\}}{\leveltext\leveltemplateid2\'01\uc0\u8259 ;}{\levelnumbers;}\fi-360\li1440\lin1440 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{hyphen\}}{\leveltext\leveltemplateid101\'01\uc0\u8259 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{hyphen\}}{\leveltext\leveltemplateid102\'01\uc0\u8259 ;}{\levelnumbers;}\fi-360\li1440\lin1440 }{\listname ;}\listid2}
{\list\listtemplateid3\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{hyphen\}}{\leveltext\leveltemplateid201\'01\uc0\u8259 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid3}
{\list\listtemplateid4\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{hyphen\}}{\leveltext\leveltemplateid301\'01\uc0\u8259 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid4}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}{\listoverride\listid3\listoverridecount0\ls3}{\listoverride\listid4\listoverridecount0\ls4}}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab560
\pard\pardeftab560\slleading20\partightenfactor0

\f0\fs26 \cf0 # java-car-racing\
\pard\pardeftab560\slleading20\pardirnatural\partightenfactor0
\cf0 \
\pard\pardeftab560\slleading20\partightenfactor0
\cf0 ## \uc0\u44592 \u45733 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls1\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51088 \u46041 \u52264  \u51060 \u47492 \u44284  \u49892 \u54665  \u54943 \u49688 \u47484  \u48512 \u50668 \u48155 \u45716 \u45796 .\
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls1\ilvl1
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51088 \u46041 \u52264  \u51060 \u47492 \u51008  \u49788 \u54364 (,)\u47484  \u44592 \u51456 \u51004 \u47196  \u44396 \u48516 \u54616 \u44256  5\u51088  \u51060 \u54616 \u47564  \u44032 \u45733 \u54616 \u45796 .\
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls1\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51452 \u50612 \u51652  \u54943 \u49688  \u46041 \u50500  n \u45824 \u51032  \u51088 \u46041 \u52264 \u45716  \u51204 \u51652 \u54616 \u44144 \u45208  \u47688 \u52656 \u51080 \u45716 \u45796 .\
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls1\ilvl1
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 0-9 \uc0\u49324 \u51060 \u51032  \u47924 \u51089 \u50948  \u44050 \u51012  \u44396 \u54620  \u54980  \u44536  \u44050 \u51060  4 \u51060 \u49345 \u51064  \u44221 \u50864  \u51204 \u51652 \u54620 \u45796 .\
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls1\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u49892 \u54665 \u51060  \u54620  \u48264  \u45149 \u45216  \u46412 \u47560 \u45796  \u49892 \u54665 \u44208 \u44284 \u47484  \u52636 \u47141 \u54616 \u44256  \u51060 \u46412  \u51088 \u46041 \u52264  \u51060 \u47492 \u51012  \u44057 \u51060  \u52636 \u47141 \u54620 \u45796 .\
\ls1\ilvl0
\fs24 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51088 \u46041 \u52264  \u44221 \u51452  \u44172 \u51076 \u51012  \u50756 \u47308 \u54620  \u54980  \u45572 \u44032  \u50864 \u49849 \u54664 \u45716 \u51648 \u47484  \u50508 \u47140 \u51456 \u45796 . \u50864 \u49849 \u51088 \u45716  \u54620  \u47749  \u51060 \u49345 \u51068  \u49688  \u51080 \u45796 .\
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls1\ilvl1
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u44277 \u46041  \u50864 \u49849 \u51032  \u44221 \u50864  \u49788 \u54364 (,)\u47484  \u49324 \u50857 \u54644  \u44396 \u48516 \u54620 \u45796 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls1\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u49324 \u50857 \u51088 \u44032  \u51096 \u47803 \u46108  \u44050 \u51012  \u51077 \u47141 \u54624  \u44221 \u50864 \'a0IllegalArgumentException\u51012  \u48156 \u49373 \u49884 \u53416  \u54980  \u50528 \u54540 \u47532 \u52992 \u51060 \u49496 \u51008  \u51333 \u47308 \u46104 \u50612 \u50556  \u54620 \u45796 \
\pard\pardeftab560\slleading20\partightenfactor0
\cf0 \
## \uc0\u49892 \u54665  \u48169 \u48277 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls2\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u44221 \u51452 \u54624  \u51088 \u46041 \u52264  \u51060 \u47492 \u51012  \u51077 \u47141 \u54620 \u45796 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls2\ilvl1
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51088 \u46041 \u52264  \u51060 \u47492 \u51012  \u49788 \u54364 (,) \u44592 \u51456 \u51004 \u47196  \u44396 \u48516 \u54620 \u45796 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls2\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u49884 \u46020 \u54624  \u54943 \u49688 \u47484  \u51077 \u47141 \u54620 \u45796 \
\ls2\ilvl0
\fs24 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u52264 \u49688 \u48324  \u49892 \u54665  \u44208 \u44284 \u47484  \u52636 \u47141 \u54620 \u45796 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls2\ilvl1
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51652 \u52636 \u54620 \u47564 \u53372  -\u47196  \u54364 \u49884 \u54620 \u45796 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls2\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u50864 \u49849 \u51088 \u47484  \u52636 \u47141 \u54620 \u45796 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls2\ilvl1
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u44277 \u46041  \u50864 \u49849 \u51032  \u44221 \u50864  \u49788 \u54364 (,)\u47196  \u44396 \u48516 \u54644  \u52636 \u47141 \u54620 \u45796 \
\pard\pardeftab560\slleading20\pardirnatural\partightenfactor0
\cf0 \
\pard\pardeftab560\slleading20\partightenfactor0
\cf0 ## \uc0\u44396 \u54788 \u54624  \u44592 \u45733  \u47785 \u47197 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls3\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51088 \u46041 \u52264  \u51060 \u47492  \u51077 \u47141  \u48155 \u44592 \
\ls3\ilvl0
\fs24 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u49892 \u54665  \u54943 \u49688  \u51077 \u47141  \u48155 \u44592 \
\ls3\ilvl0
\fs24 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u51312 \u44148 \u50640  \u46384 \u46972  \u51204 \u51652 \u54616 \u44592 \
\ls3\ilvl0
\fs24 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u49892 \u54665  \u44208 \u44284  \u52636 \u47141 \u54616 \u44592 \
\ls3\ilvl0
\fs24 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u50864 \u49849 \u51088  \u54032 \u48324 \u54616 \u44592 \
\ls3\ilvl0
\fs24 {\listtext	\uc0\u8259 	}
\fs26 \uc0\u50864 \u49849 \u51088  \u52636 \u47141 \u54616 \u44592 \
\pard\pardeftab560\slleading20\pardirnatural\partightenfactor0
\cf0 \
\pard\pardeftab560\slleading20\partightenfactor0
\cf0 ## \uc0\u50756 \u47308 \u46108  \u44592 \u45733 \
\pard\pardeftab560\slleading20\pardirnatural\partightenfactor0
\cf0 \
\pard\pardeftab560\slleading20\partightenfactor0
\cf0 ## \uc0\u44592 \u53440 \
\pard\pardeftab560\pardirnatural\partightenfactor0
\ls4\ilvl0
\fs24 \cf0 {\listtext	\uc0\u8259 	}
\f1\fs26 \'c0\'df\'b8\'f8\'b5\'c8
\f0  
\f1 \'b0\'aa
\f0  
\f1 \'c0\'d4\'b7\'c2\'c7\'d2
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  IllegalArgumentException
\f1 \'c0\'bb
\f0  
\f1 \'b9\'df\'bb\'fd\'bd\'c3\'c5\'b2
\f0  
\f1 \'c8\'c4
\f0  
\f1 \'be\'d6\'c7\'c3\'b8\'ae\'c4\'c9\'c0\'cc\'bc\'c7\'c0\'ba
\f0  
\f1 \'c1\'be\'b7\'e1
\f0 \
}
>>>>>>> 1f6cf6e (main application작성)
