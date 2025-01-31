type: 1
name: BITS_process_whitelist
fillType: Registry
userCanEditContent: true
fields:
  - fullpath:
      type: Regex
      primaryKey: true
      index: true
      nullable: false
defaults:
  PT:
    - fullpath: \\microsoft\\edge\\application\\msedge\\.exe$
    - fullpath: \\mozilla firefox\\firefox\.exe$
    - fullpath: \\appdata\\local\\microsoft\\onedrive\\[\d\.]+\\microsoft.sharepoint.exe