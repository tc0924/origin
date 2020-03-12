" ウィンドウの縦幅
set lines=55
" ウィンドウの横幅
set columns=180
"256色対応
set t_Co=256
" ダーク系のカラースキームを使う
set background=dark
" カラースキーム
colorscheme onehalflight
" フォント設定
set guifont=Cica:h12
set guifontwide=Cica:h12
" DirectX
set renderoptions=type:directx,renmode:5
" ツールバーを非表示
set guioptions-=T
" メニューバーを非表示
set guioptions-=m
" GVimを半透明にする
" autocmd FocusGained * set transparency=240
" autocmd FocusLost * set transparency=128
" 括弧の対応関係を一瞬表示する
set showmatch
" Vimの「%」を拡張する
source $VIMRUNTIME/macros/matchit.vim 
" コマンドモードの補完
set wildmenu
set wildmode=list:longest
" 保存するコマンド履歴の数
set history=5000 
" 不可視文字を表示
set list
set listchars=tab:»-,trail:-,eol:↲,extends:»,precedes:«,nbsp:%
" 不可視文字の色設定
hi NonText guibg=NONE guifg=#a0a1a7
hi SpecialKey guibg=NONE guifg=#a0a1a7
" CJK文字対策
set ambiwidth=double
" Windowsの場合
if has('win32') || has ('win64')
    " Windows環境用のコード
    let Grep_Path = 'C:\Git\usr\bin\grep.exe' 
    let Grep_Xargs_Path = 'C:\Git\usr\bin\xargs.exe' 
    let Grep_Find_Path = 'C:\Git\usr\bin\find.exe'
    let Grep_Shell_Quote_Char = '"'
endif

