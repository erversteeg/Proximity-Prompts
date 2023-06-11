line1  = '{configTYpe} {namePrefix}{ucConfigName}(int reminderId)'
line2  = '{'
line3  = '    {ifType} (reminderId == {number}) return config.{lcName}{ucConfigName}();'
line4  = '    else return {defaultReturn};'
line5  = '}'

configInfo = [
    ["Enable", "boolean"],
    ["Text", "String"],
    ["Color", "Color"],
    ["Duration", "int"],
    ["Cooldown", "int"],
    ["TimeUnit", "TimeUnit"],
    ["Notify", "boolean"],
    ["Times", "String"],
    ["DaysOfWeek", "String"],
    ["Dates", "String"],
    ["Coordinates", "String"],
    ["Radius", "int"],
    ["Geofences", "String"],
    ["RegionIds", "String"],
    ["NpcIds", "String"],
    ["ItemIds", "String"],
    ["ChatPatterns", "String"],
    ["SeparatePanel", "boolean"],
    ["PanelAnchorType", "RSAnchorType"],
    ["PanelAnchorX", "int"],
    ["PanelAnchorY", "int"]
]

for info in configInfo:
    name = info[0]
    type = info[1]

    prefix = "get"
    if type == 'boolean':
        prefix = "is"

    print(line1.format(configTYpe=type, namePrefix=prefix, ucConfigName=name))
    print(line2)

    for index in range(1,101):
        if_type = "else if"
        if index == 1:
            if_type = "if"

        print(line3.format(ifType=if_type, number=index, lcName="reminder" + str(index), ucConfigName=name))

    default_return = "false"
    if type == "String":
        default_return = '""'
    elif type == "int":
        default_return = "0"
    elif type == "Color":
        default_return = "Color.WHITE"
    elif type == "RSAnchorTYpe":
        default_return = "RSAnchorType.TOP_LEFT"

    print(line4.format(defaultReturn=default_return))
    print(line5)
    print("")


