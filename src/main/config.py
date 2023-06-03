line1  = '    @ConfigSection('
line2  = '            name = "{ucName}",'
line3  = '            description = "Reminder {number}",'
line4  = '            position = {pos},'
line5  = '            closedByDefault = true'
line6  = '    )'
line7  = '    String {lcName}= "{lcName}";'
line8  = ''
line9  = '    @ConfigItem('
line10 = '            keyName = "enable{ucName}",'
line11 = '            position = 0,'
line12 = '            name = "Enabled",'
line13 = '            description = "Configures whether or not reminder #{number} is enabled.",'
line14 = '            section = {lcName}'
line15 = '    )'
line16 = '    default boolean {lcName}Enable()  {{ return false; }}'
line17 = ''
line18 = '    @ConfigItem('
line19 = '            keyName = "{lcName}Text",'
line20 = '            position = 1,'
line21 = '            name = "Text",'
line22 = '            description = "Configures the text.",'
line23 = '            section = {lcName}'
line24 = '    )'
line25 = '    default String {lcName}Text() {{ return ""; }}'
line26 = ''
line27 = '    @ConfigItem('
line28 = '            keyName = "{lcName}Color",'
line29 = '            position = 2,'
line30 = '            name = "Color",'
line31 = '            description = "Configures the color.",'
line32 = '            section = {lcName}'
line33 = '    )'
line34 = '    default Color {lcName}Color() {{ return Color.WHITE; }}'
line35 = ''
line36 = '    @ConfigItem('
line37 = '            keyName = "{lcName}Time",'
line38 = '            position = 3,'
line39 = '            name = "Time",'
line40 = '            description = "Configures what time reminder is shown, e.g. 8:30am, 12:00pm.",'
line41 = '            section = {lcName}'
line42 = '    )'
line43 = '    default String {lcName}Time() {{ return ""; }}'
line44 = ''
line45 = '    @ConfigItem('
line46 = '            keyName = "{lcName}Monday",'
line47 = '            position = 4,'
line48 = '            name = "Monday",'
line49 = '            description = "Configures whether or not reminder is shown on Mondays.",'
line50 = '            section = {lcName}'
line51 = '    )'
line52 = '    default boolean {lcName}Monday() {{ return false; }}'
line53 = ''
line54 = '    @ConfigItem('
line55 = '            keyName = "{lcName}Tuesday",'
line56 = '            position = 5,'
line57 = '            name = "Tuesday",'
line58 = '            description = "Configures whether or not reminder is shown on Tuesdays.",'
line59 = '            section = {lcName}'
line60 = '     )'
line61 = '     default boolean {lcName}Tuesday() {{ return false; }}'
line62 = ''
line63 = '     @ConfigItem('
line64 = '           keyName = "{lcName}Wednesday",'
line65 = '           position = 6,'
line66 = '           name = "Wednesday",'
line67 = '           description = "Configures whether or not reminder is shown on Wednesdays.",'
line68 = '           section = {lcName}'
line69 = '     )'
line70 = '     default boolean {lcName}Wednesday() {{ return false; }}'
line71 = ''
line72 = '     @ConfigItem('
line73 = '           keyName = "{lcName}Thursday",'
line74 = '           position = 7,'
line75 = '           name = "Thursday",'
line76 = '           description = "Configures whether or not reminder is shown on Thursdays.",'
line77 = '           section = {lcName}'
line78 = '     )'
line79 = '     default boolean {lcName}Thursday() {{ return false; }}'
line80 = ''
line81 = '     @ConfigItem('
line82 = '           keyName = "{lcName}Friday",'
line83 = '           position = 8,'
line84 = '           name = "Friday",'
line85 = '           description = "Configures whether or reminder is shown on Fridays.",'
line86 = '           section = {lcName}'
line87 = '     )'
line88 = '     default boolean {lcName}Friday() {{ return false; }}'
line89 = ''
line90 = '     @ConfigItem('
line91 = '           keyName = "{lcName}Saturday",'
line92 = '           position = 9,'
line93 = '           name = "Saturday",'
line94 = '           description = "Configures whether or not reminder is shown on Saturdays.",'
line95 = '           section = {lcName}'
line96 = '     )'
line97 = '     default boolean {lcName}Saturday() {{ return false; }}'
line98 = ''
line99 = '     @ConfigItem('
line100 = '           keyName = "{lcName}Sunday",'
line101 = '           position = 10,'
line102 = '           name = "Sunday",'
line103 = '           description = "Configures whether or not reminder is shown on Sundays.",'
line104 = '           section = {lcName}'
line105 = '     )'
line106 = '     default boolean {lcName}Sunday() {{ return false; }}'
line107 = ''
line108 = '     @ConfigItem('
line109 = '           keyName = "{lcName}Date",'
line110= '            position = 11,'
line111 = '           name = "Date",'
line112 = '           description = "Configures the date when reminder is shown, e.g. 04/30, 05/28/23",'
line113 = '           section = {lcName}'
line114 = '      )'
line115 = '      default String {lcName}Date() {{ return ""; }}'
line116 = ''
line117 = '      @ConfigItem('
line118 = '            keyName = "{lcName}LocationX",'
line119 = '            position = 12,'
line120 = '            name = "Location X",'
line121 = '            description = "Configures the x coordinate for when reminder is shown.",'
line122 = '            section = {lcName}'
line123 = '      )'
line124 = '      default int {lcName}LocationX() {{ return 0; }}'
line125 = ''
line126 = '      @ConfigItem('
line127 = '            keyName = "{lcName}LocationY",'
line128 = '            position = 13,'
line129 = '            name = "Location Y",'
line130 = '            description = "Configures the y coordinate for when reminder is shown.",'
line131 = '            section = {lcName}'
line132 = '      )'
line133 = '      default int {lcName}LocationY() {{ return 0; }}'
line134 = ''
line135 = '      @ConfigItem('
line136 = '            keyName = "{lcName}Radius",'
line137 = '            position = 14,'
line138 = '            name = "Location Radius",'
line139 = '            description = "Configures how far from the location reminder is shown.",'
line140 = '            section = {lcName}'
line141 = '      )'
line142 = '      default int {lcName}Radius() {{ return 0; }}'
line143 = ''
line144 = '      @ConfigItem('
line145 = '      keyName = "{ucName}RegionId",'
line146 = '            position = 15,'
line147 = '            name = "Region ID",'
line148 = '            description = "Configures the region id for when reminder is shown.",'
line149 = '            section = {lcName}'
line150 = '      )'
line151 = '      default int {lcName}RegionId() {{ return 0; }}'
line152 = ''
line153 = '      @ConfigItem('
line154 = '      keyName = "{ucName}NpcIds",'
line155 = '            position = 16,'
line156 = '            name = "Npc IDs",'
line157 = '            description = "Configures the npc ids for when reminder is shown.",'
line158 = '            section = {lcName}'
line159 = '      )'
line160 = '      default String {lcName}NpcIds() {{ return ""; }}'
line161 = ''
line162 = '      @ConfigItem('
line163 = '      keyName = "{ucName}ItemIds",'
line164 = '            position = 17,'
line165 = '            name = "Item IDs",'
line166 = '            description = "Configures the item ids for when reminder is shown.",'
line167 = '            section = {lcName}'
line168 = '      )'
line169 = '      default String {lcName}ItemIds() {{ return ""; }}'
line170 = ''
line171 = '      @ConfigItem('
line172 = '      keyName = "{ucName}Duration",'
line173 = '            position = 19,'
line174 = '            name = "Duration",'
line175 = '            description = "Configures the duration reminder is shown (minutes).",'
line176 = '            section = {lcName}'
line177 = '      )'
line178 = '      default int {lcName}Duration() {{ return 5; }}'
line179 = ''
line180 = '      @ConfigItem('
line181 = '      keyName = "{ucName}Cooldown",'
line182 = '            position = 20,'
line183 = '            name = "Cooldown",'
line184 = '            description = "Configures the cooldown before reminder can be shown again (minutes).",'
line185 = '            section = {lcName}'
line186 = '      )'
line187 = '      default int {lcName}Cooldown() {{ return 5; }}'
line188 = ''

config = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7 + "\n" + line8 + \
         "\n" + line9 + "\n" + line10 + "\n" + line11 + "\n" + line12 + "\n" + line13 + "\n" + line14 + "\n" + line15 + "\n" + \
         line16 + "\n" + line17 + "\n" + line18 + "\n" + line19 + "\n" + line20 + "\n" + line21 + "\n" + line22 + "\n" + line23 + \
         "\n" + line24 + "\n" + line25 + "\n" + line26 + "\n" + line27 + "\n" + line28 + "\n" + line29 + "\n" + line30 + "\n" + line31 + \
         "\n" + line32 + "\n" + line33 + "\n" + line34 + "\n" + line35 + "\n" + line36 + "\n" + line37 + "\n" + line38 + "\n" + line39 + \
         "\n" + line40 + "\n" + line41 + "\n" + line42 + "\n" + line43 + "\n" + line44 + "\n" + line45 + "\n" + line46 + "\n" + line47 + \
         "\n" + line48 + "\n" + line49 + "\n" + line50 + "\n" + line51 + "\n" + line52 + "\n" + line53 + "\n" + line54 + "\n" + line55 + \
         "\n" + line56 + "\n" + line57 + "\n" + line58 + "\n" + line59 + "\n" + line60 + "\n" + line61 + "\n" + line62 + "\n" + line63 + \
         "\n" + line64 + "\n" + line65 + "\n" + line66 + "\n" + line67 + "\n" + line68 + "\n" + line69 + "\n" + line70 + "\n" + line71 + \
         "\n" + line72 + "\n" + line73 + "\n" + line74 + "\n" + line75 + "\n" + line76 + "\n" + line77 + "\n" + line78 + "\n" + line79 + \
         "\n" + line80 + "\n" + line81 + "\n" + line82 + "\n" + line83 + "\n" + line84 + "\n" + line85 + "\n" + line86 + "\n" + line87 + \
         "\n" + line88 + "\n" + line89 + "\n" + line90 + "\n" + line91 + "\n" + line92 + "\n" + line93 + "\n" + line94 + "\n" + line95 + \
         "\n" + line96 + "\n" + line97 + "\n" + line98 + "\n" + line99 + "\n" + line100 + "\n" + line101 + "\n" + line102 + \
         "\n" + line103 + "\n" + line104 + "\n" + line105 + "\n" + line106 + "\n" + line107 + "\n" + line108 + "\n" + line109 + \
         "\n" + line110 + "\n" + line111 + "\n" + line112 + "\n" + line113 + "\n" + line114 + "\n" + line115 + "\n" + line116 + \
         "\n" + line117 + "\n" + line118 + "\n" + line119 + "\n" + line120 + "\n" + line121 + "\n" + line122 + "\n" + line123 + \
         "\n" + line124 + "\n" + line125 + "\n" + line126 + "\n" + line127 + "\n" + line128 + "\n" + line129 + "\n" + line130 + \
         "\n" + line131 + "\n" + line132 + "\n" + line133 + "\n" + line134 + "\n" + line135 + "\n" + line136 + "\n" + line137 + \
         "\n" + line138 + "\n" + line139 + "\n" + line140 + "\n" + line141 + "\n" + line142 + "\n" + line143 + "\n" + line144 + \
         "\n" + line145 + "\n" + line146 + "\n" + line147 + "\n" + line148 + "\n" + line149 + "\n" + line150 + "\n" + line151 + \
         "\n" + line152 + "\n" + line153 + "\n" + line154 + "\n" + line155 + "\n" + line156 + "\n" + line157 + "\n" + line158 + \
         "\n" + line159 + "\n" + line160 + "\n" + line161 + "\n" + line162 + "\n" + line163 + "\n" + line164 + "\n" + line165 + \
         "\n" + line166 + "\n" + line167 + "\n" + line168 + "\n" + line169 + "\n" + line170 + "\n" + line171 + "\n" + line172 + \
         "\n" + line173 + "\n" + line174 + "\n" + line175 + "\n" + line176 + "\n" + line177 + "\n" + line178 + "\n" + line179 + \
         "\n" + line180 + "\n" + line181 + "\n" + line182 + "\n" + line183 + "\n" + line184 + "\n" + line185 + "\n" + line186 + \
         "\n" + line187 + "\n" + line188 + "\n"

for index in range(1,101):
    print(config.format(number=index, ucName="Reminder" + str(index), lcName="reminder" + str(index), pos=(20 + index)))